package com.javaex.ex04;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.util.ArrayList;
import java.util.List;

public class PhoneApp {
	
	public static void main(String[] args) throws IOException {
		
		Reader fr = new FileReader("C:\\Users\\1\\Desktop\\새 폴더\\PhoneDB.txt");
		BufferedReader br = new BufferedReader(fr);
		br.close();
		List<String> List = new ArrayList<String>();
		String str;
		while((str = br.readLine()) !=null) {
			
		}
	}

		
}
