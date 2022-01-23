package br.com.bbnsdevelop.minesweeper.model;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

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

}
