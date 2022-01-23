package br.com.bbnsdevelop.minesweeper.model;

import java.util.ArrayList;
import java.util.List;

public class Field {
	
	private final int line;
	private final int column;	

	private boolean isOpen;
	private boolean mined;
	private boolean checked;
	
	private List<Field> fields = new ArrayList<>();
	
	Field(int line, int column){
		this.line = line;
		this.column = column;
	}
	
	boolean addNext(Field field) {
		boolean isLineDifferent = line != field.line;
		boolean isColumnDifferent = column != field.column;
		boolean diagonal = isLineDifferent && isColumnDifferent;
		
		int deltaLine = Math.abs(line - field.line);
		int deltaColum = Math.abs(column - field.column);
		int deltaSum = deltaLine +  deltaColum;
		
		if(deltaSum == 1 && !diagonal) {
			fields.add(field);
			return true;
		}
		else if(deltaSum == 2 && diagonal) {
			fields.add(field);
			return true;
		}
		else {
			return false;
		}
	}
	
}
