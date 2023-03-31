package br.com.bbnsdevelop.minesweeper.model;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

import br.com.bbnsdevelop.minesweeper.exceptions.ExplosionException;

public class Board {
	
	private int qtdLines;
	private int qtdColumns;
	private int qtdMines;

	private final List<Field> fields = new ArrayList<>();

	public Board(int qtdLines, int qtdColumns, int qtdMines) {
		this.qtdLines = qtdLines;
		this.qtdColumns = qtdColumns;
		this.qtdMines = qtdMines;
		
		createField();
		connectFields();
		generateMines();
		
	}
	
	public void open(int line, int column) {
		
		try {
			Predicate<? super Field> predicate = f -> f.getLine() == line && f.getColumn() == column;		
			fields.parallelStream().filter(predicate).findFirst().ifPresent(f -> f.open());
			
		} catch (ExplosionException e) {
			fields.forEach(f -> f.setIsOpen(true));
			throw e;
			
		}
		
		
	}
	public void check(int line, int column) {
		
		Predicate<? super Field> predicate = f -> f.getLine() == line && f.getColumn() == column;		
		fields.parallelStream().filter(predicate).findFirst().ifPresent(f -> f.changeChecked());
		
	}
	
	public boolean goalAchieved() {
		return fields.stream().allMatch(f-> f.goalAchieved());
	}
	
	public void reatart() {
		fields.forEach( f -> f.reatart());
		generateMines();
		
	}
	
	public String toString() {
		StringBuilder sb = new StringBuilder();
		
		sb.append("    ");
		for (int c = 0; c < qtdColumns; c++) {
			sb.append(" ");
			sb.append(c);
			sb.append(" ");			
		}
		sb.append("\n");
		sb.append("     ");
		sb.append("-- ".repeat(qtdColumns));
		sb.append("\n");

		int index = 0;
		for (int line = 0; line < qtdLines; line++) {
			sb.append(line);
			sb.append(" | ");
			for (int column = 0; column < qtdColumns; column++) {
				sb.append(" ");
				sb.append(fields.get(index));
				sb.append(" ");
				
				index++;
			}
			sb.append("\n");
		}

		return sb.toString();
	}

	private void generateMines() {
		long qtMinesExisting = 0;
		Predicate<Field> predicate = f-> f.isMined();
		
		do {
			int chooseRandomFieldToUndermine = (int) (Math.random() * fields.size());
			fields.get(chooseRandomFieldToUndermine).undermine();			
			qtMinesExisting = fields.stream().filter(predicate).count();
		} while (qtMinesExisting < qtdMines);
		
	}

	private void connectFields() {
		for (Field field : fields) {
			for (Field field2 : fields) {
				field.addNext(field2);
			}
		}
		
	}

	private void createField() {
		
		for (int line = 0; line < qtdLines; line++) {
			for (int column = 0; column < qtdColumns; column++) {
				fields.add(new Field(line, column));
			}
		}
		
	}

}
