package br.com.bbnsdevelop.iostream.serialization;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class DeserializationDemo {
	
	public static void main(String[] args) {
		
		try {
			FileInputStream fis = new FileInputStream("/media/b2/file_storage/_trabalho/projetos/java-11-until-17/files-to-teste/emp.ser");
			ObjectInputStream ois = new ObjectInputStream(fis);
			
			Employee emp = (Employee) ois.readObject();
			
			System.out.println(emp);
			
		} catch (FileNotFoundException e) {			
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		
		
	}

}
