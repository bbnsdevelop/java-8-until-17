package br.com.bbnsdevelop.minesweeper;

import java.util.Scanner;

import br.com.bbnsdevelop.minesweeper.model.Board;
import br.com.bbnsdevelop.minesweeper.view.TerminalBoard;

public class App {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		try {
			System.out.println("Choose the quantity of lines: ");
			int lines = scanner.nextInt();

			System.out.println("Choose the quantity of columns: ");
			int columns = scanner.nextInt();

			System.out.println("Choose the quantity of mines");
			int mines = scanner.nextInt();

			Board board = new Board(lines, columns, mines);
			new TerminalBoard(board);
		} catch (Exception e) {

		} finally {
			scanner.close();
		}

	}

}
