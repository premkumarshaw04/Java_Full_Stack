package com.jsp.writer;

import java.io.FileWriter;
import java.io.IOException;

//Using FileWriter
public class MainClass8 {
	public static void main(String[] args) {
		FileWriter ref = null;
		try {
			ref = new FileWriter("C:/FILEIO/log.txt",true);
			ref.write("Java");
			ref.write("\n");
			ref.write("SQL");
			ref.write("\n");
			ref.write("HTML");
			ref.write("\n");
			ref.write(65);
			ref.write("\n");
			char[] ch = {'T','i','g','e','r'};
			ref.write(ch);
			ref.write("\n");
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
