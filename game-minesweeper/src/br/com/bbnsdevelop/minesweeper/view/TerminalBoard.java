package br.com.bbnsdevelop.minesweeper.view;

import java.util.Arrays;
import java.util.Iterator;
import java.util.Scanner;

import br.com.bbnsdevelop.minesweeper.exceptions.ExitException;
import br.com.bbnsdevelop.minesweeper.exceptions.ExplosionException;
import br.com.bbnsdevelop.minesweeper.model.Board;

public class TerminalBoard {
	
	private Board board;
	private Scanner scanner = new Scanner(System.in);

	public TerminalBoard(Board board) {
		this.board = board;
		exec();
	}
	
	public void exec() {		
		try {
			boolean wantContinue = true;
			while (wantContinue) {
				play();
				System.out.println("Want start a new game? (Y/n) ");
				String response = scanner.nextLine();
				
				if("n".equalsIgnoreCase(response)) {
					wantContinue = false;
				}else {
					board.reatart();
				}
			}
			
		} catch (ExitException e) {
			System.out.println("Bye!!!");
		}finally {
			scanner.close();
		}
		
		System.out.println("Finished");
	}

	private void play() {
		try {
			while(!board.goalAchieved()) {
				System.out.println(board);
				String typed = catchValueTyped("Typing line/column, (X,Y): ");
				
				Iterator<Integer> xy = Arrays.stream(typed.split(",")).map(e -> Integer.parseInt(e.trim())).iterator();
				
				typed = catchValueTyped("1 - Open or 2 - (uncheck / check)");
				int x = xy.next();
				int y = xy.next();				
				if("1".equals(typed)) {					
					board.open(x, y);
				}else if("2".equalsIgnoreCase(typed)) {
					board.check(x, y);
				}
				
			}
			
			System.out.println("Win");
		} catch (ExplosionException e) {
			System.out.println(board);
			System.out.println("game over!!");
		}
		
	}
	
	private String catchValueTyped(String text) {
		System.out.println(text);
		String typed = scanner.nextLine();
		
		if("exit".equalsIgnoreCase(typed)) {
			throw new ExitException();
		}
		return typed;
	}
	
	

}
