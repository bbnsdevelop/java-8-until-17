package br.com.bbnsdevelop.iostream.serialization;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class SerializationDemo {
	
	public static void main(String[] args) {
		FileOutputStream fos;
		ObjectOutputStream oos;
		
		try {
			fos = new FileOutputStream("/media/b2/file_storage/_trabalho/projetos/java-11-until-17/files-to-teste/emp.ser");
			oos = new ObjectOutputStream(fos);
			
			Employee emp = new Employee(1, "Jhon", 100000, 123456);
			oos.writeObject(emp);
			
			System.out.println("Finished");
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
	}

}
