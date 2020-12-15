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

		String str = "";
		
		while (true) {
			str = br.readLine();
			if (str == null) {
				break;
			}
			
			String[] person = str.split(",");
			String name = person[0];
			String hp = person[1];
			String company = person[2];
			
			System.out.println("이름: "+name);
			System.out.println("핸드폰: "+hp);
			System.out.println("회사: "+company);
			System.out.println("");
		}
		br.close();

	}

}
