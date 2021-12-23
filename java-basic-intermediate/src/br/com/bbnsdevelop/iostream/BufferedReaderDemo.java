package br.com.bbnsdevelop.iostream;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class BufferedReaderDemo {

	public static void main(String[] args) throws IOException {
		FileReader fr = null;
		BufferedReader br = null;

		fr = new FileReader("/media/b2/file_storage/_trabalho/projetos/java-11-until-17/files-to-teste/file.txt");
		br = new BufferedReader(fr);

		int count = 0;

		String line;

		while ((line = br.readLine()) != null) {

			StringTokenizer st = new StringTokenizer(line);
			while (st.hasMoreTokens()) {
				System.out.println(st.nextToken());
				count++;
			}
		}
		System.out.println("Number of words in the file are :" + count);
		
		fr.close();
		br.close();

	}

}
