package br.com.bbnsdevelop.basics.exceptions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class FileRead {

	void readFile() throws FileNotFoundException{
		FileInputStream file = new FileInputStream("");
	}
	
	public static void main(String[] args) throws FileNotFoundException {
		
		FileRead f = new FileRead();
		
		try {
			f.readFile();
		} catch (FileNotFoundException e) {
			System.out.println("Exception: ".concat(e.getMessage()));
			
			throw e;
		}
		
	}
}
