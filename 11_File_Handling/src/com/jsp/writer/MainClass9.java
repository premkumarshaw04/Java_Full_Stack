package com.jsp.writer;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

//Using BufferedWriter
public class MainClass9 {
	public static void main(String[] args) {
		BufferedWriter ref = null;
		try {
			ref = new BufferedWriter(new FileWriter("C:/FILEIO/rough.txt"));
			ref.write("Apple");
			ref.newLine();
			ref.write("Banana");
			ref.newLine();
			ref.write(97);
			ref.newLine();
			char[] ch = {'M','a','n','g','o'};
			ref.write(ch);
			ref.newLine();
			ref.flush();
			System.out.println("Write Complete");
		}
		catch(IOException e) {
			e.printStackTrace();
		}
		finally {
			try {
				ref.close();
			}
			catch(IOException e) {
				e.printStackTrace();
			}
		}
	}
}
