package br.com.bbnsdevelop.iostream;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class BufferedReaderTryBlockDemo {

	public static void main(String[] args) {

		int count = 0;

		try (FileReader fr = new FileReader(
				"/media/b2/file_storage/_trabalho/projetos/java-11-until-17/files-to-teste/file.txt");
				BufferedReader br = new BufferedReader(fr);) 
		{

			String line;

			while ((line = br.readLine()) != null) {

				StringTokenizer st = new StringTokenizer(line);
				while (st.hasMoreTokens()) {
					System.out.println(st.nextToken());
					count++;
				}
			}
			System.out.println("Number of words in the file are :" + count);

		} catch (IOException e) {
			System.out.println("Erro on read or write file");
		}

	}

}
