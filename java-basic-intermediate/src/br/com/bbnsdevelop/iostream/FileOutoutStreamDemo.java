package br.com.bbnsdevelop.iostream;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutoutStreamDemo {

	public static void main(String[] args) {
		FileInputStream fis = null;
		FileOutputStream fos = null;

		try {
			fis = new FileInputStream(new File(
					"/media/b2/file_storage/_trabalho/projetos/java-11-until-17/files-to-teste/Screenshot.png"));
			int data;

			fos = new FileOutputStream(new File(
					"/media/b2/file_storage/_trabalho/projetos/java-11-until-17/files-to-teste/copy-Screenshot.png"));
			while ((data = fis.read()) != -1) {
				fos.write(data);
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				fis.close();
				fos.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

}
