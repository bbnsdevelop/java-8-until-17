package br.com.bbnsdevelop.iostream;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileInputStreamDemo {

	public static void main(String[] args) {

		FileInputStream fis = null;
		try {
			fis = new FileInputStream(new File("/media/b2/file_storage/_trabalho/projetos/java-11-until-17/files-to-teste/file.txt"));

			System.out.println("File opened");
			int i;
			while ((i = fis.read()) != -1) {
				System.out.print((char)i);
			}			
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}catch(IOException e) {
			e.printStackTrace();
		}
		finally {
			try {
				fis.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
			System.out.println("File closed");
		}

	}

}
