package com.javaex.ex02;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

public class CharStreamApp2 {

	public static void main(String[] args) throws IOException {

		Reader fr = new FileReader("C:\\Users\\1\\Desktop\\새 폴더\\song.txt");
		// Reader fr = new FileReader("C:\\Users\\1\\Desktop\\새 폴더\\MS949.txt");
		BufferedReader br = new BufferedReader(fr);

		while (true) {
			String str = br.readLine(); // readLine 한줄씩 읽어옴. 줄바꿈 기호는 제외
			if (str == null) { // 읽었는데 주소가 없을때
				break;
			}
			System.out.println(str);
		}

		fr.close();

	}

}
