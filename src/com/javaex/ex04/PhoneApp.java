package com.javaex.ex04;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;
import java.io.Writer;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PhoneApp {
	
	public static void main(String[] args) throws IOException {
		
		Reader fr = new FileReader("C:\\Users\\1\\Desktop\\새 폴더\\PhoneDB.txt");
		BufferedReader br = new BufferedReader(fr);
		
		List<Person> list = new ArrayList<Person>();
		String str;
		
		Scanner sc = new Scanner(System.in);
	
		while(true) {
			str = br.readLine();
			if(str == null) {
				break;
			}
			String[] pr = str.split(",");
			
			Person person = new Person(pr[0],pr[1],pr[2]);
			list.add(person);
			
		}
		
		System.out.println(list.toString());
		
		Writer fw = new FileWriter("C:\\Users\\1\\Desktop\\새 폴더\\PhoneDB.txt");
		BufferedWriter bw = new BufferedWriter(fw);
		
		for(Person p : list) {
			String line = p.getName() + "," + p.getHp() + "," + p.getCompany();
			bw.write(line);
			bw.newLine();
		}
		
		
		
		
		
		sc.close();
		br.close();
	}

		
}
