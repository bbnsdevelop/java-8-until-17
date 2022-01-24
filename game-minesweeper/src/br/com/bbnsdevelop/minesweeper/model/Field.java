package br.com.bbnsdevelop.minesweeper.model;

import java.util.ArrayList;
import java.util.List;

import br.com.bbnsdevelop.minesweeper.exceptions.ExplosionException;

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
	
	void changeChecked() {
		if(!isOpen) {
			checked = !checked;
		}
	}
	
	
	boolean open() {
		
		if(!isOpen && !checked) {
			isOpen = true;
			if(mined) {
				throw new ExplosionException();
			}
			if(secureField()) {
				fields.forEach(f -> f.open());
			}
			return true;
		}		
		return false;
	}
	
	boolean secureField() {
		return fields.stream().noneMatch(v -> v.mined);
	}
	
	void undermine() {
		mined = true;
	}
	
	
	public boolean isChecked() {
		return checked;
	}
	
	public boolean isOpen() {
		return isOpen;
	}
	
	public boolean isClosed() {
		return !isOpen;
	}
}
