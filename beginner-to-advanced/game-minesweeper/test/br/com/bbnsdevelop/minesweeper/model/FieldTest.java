package br.com.bbnsdevelop.minesweeper.model;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import br.com.bbnsdevelop.minesweeper.exceptions.ExplosionException;

public class FieldTest {

	private Field field;

	@BeforeEach
	void init() {
		field = new Field(3, 3);
	}

	@Test
	void testAddFieldLeftOK() {
		Field next = new Field(3, 2);
		boolean isAdded = field.addNext(next);
		assertTrue(isAdded);
	}

	@Test
	void testAddFieldRightOK() {
		Field next = new Field(3, 4);
		boolean isAdded = field.addNext(next);
		assertTrue(isAdded);
	}

	@Test
	void testAddFieldTopOK() {
		Field next = new Field(2, 3);
		boolean isAdded = field.addNext(next);
		assertTrue(isAdded);
	}

	@Test
	void testAddFieldDownOK() {
		Field next = new Field(4, 3);
		boolean isAdded = field.addNext(next);
		assertTrue(isAdded);
	}

	@Test
	void testAddFieldDiagonalOK() {
		Field next = new Field(2, 2);
		boolean isAdded = field.addNext(next);
		assertTrue(isAdded);
	}

	@Test
	void testAddFieldLeftNOK() {
		Field next = new Field(1, 1);
		boolean isAdded = field.addNext(next);
		assertFalse(isAdded);
	}

	@Test
	void testDefaultChecked() {
		assertFalse(field.isChecked());
	}

	@Test
	void testChangeChecked() {
		field.changeChecked();
		assertTrue(field.isChecked());
	}

	@Test
	void testChangeDoubleChecked() {
		field.changeChecked();
		field.changeChecked();
		assertFalse(field.isChecked());
	}

	@Test
	void testOpenNoMine() {
		assertTrue(field.open());
	}

	@Test
	void testOpenNoMineChangeChecked() {
		field.changeChecked();
		assertFalse(field.open());
	}

	@Test
	void testOpenMineChangeChecked() {
		field.changeChecked();
		field.undermine();
		assertFalse(field.open());
	}

	@Test
	void testOpenMineNoChecked() {
		field.undermine();
		assertThrows(ExplosionException.class, () -> {
			field.open();
		});
	}

	@Test
	void testAddNextField() {
		Field f1 = new Field(1, 1);
		Field f2 = new Field(2, 2);

		f2.addNext(f1);
		field.addNext(f2);

		assertTrue(field.open());
		assertTrue(f1.isOpen() && f2.isOpen());
	}

	@Test
	void testAddNextFieldUndermine() {
		Field f1 = new Field(1, 1);
		Field f2 = new Field(1, 1);
		f2.undermine();

		Field f3 = new Field(2, 2);
		f3.addNext(f1);
		f3.addNext(f2);

		field.addNext(f3);

		assertTrue(field.open());
		assertTrue(f3.isOpen() && f2.isClosed());
	}

}
