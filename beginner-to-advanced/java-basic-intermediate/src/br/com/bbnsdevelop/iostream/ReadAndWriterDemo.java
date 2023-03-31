package br.com.bbnsdevelop.iostream;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class ReadAndWriterDemo {
	
	public static void main(String[] args) {
		
		FileReader fr = null;
		FileWriter fw = null;
		
		try {
			fr = new FileReader(new File("/media/b2/file_storage/_trabalho/projetos/java-11-until-17/files-to-teste/file.txt"));
			fw = new FileWriter(new File("/media/b2/file_storage/_trabalho/projetos/java-11-until-17/files-to-teste/new-file.txt"));
			
			int ch;
			
			while((ch = fr.read()) !=-1) {
				fw.write(ch);
			}				
				
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		finally {
			try {
				fr.close();
				fw.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
	}

}
