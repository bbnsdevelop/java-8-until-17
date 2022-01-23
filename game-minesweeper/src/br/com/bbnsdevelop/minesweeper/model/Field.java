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
	
}
