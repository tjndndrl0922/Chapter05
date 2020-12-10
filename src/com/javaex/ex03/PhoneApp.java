package com.javaex.ex03;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

public class PhoneApp {

	public static void main(String[] args) throws IOException {
		// 리스트x
		Reader fr = new FileReader("C:\\Users\\1\\Desktop\\새 폴더\\PhoneDB.txt");
		BufferedReader br = new BufferedReader(fr);

		while (true) {
			String str = br.readLine();
			if (str == null) {
				break;
			}
			System.out.println(str);
		}
		br.close();

	}

}
