package com.jsp.writer;

import java.io.IOException;
import java.io.PrintWriter;

//Using PrintWriter || Best Way
public class MainClass10 {
	public static void main(String[] args) {
		PrintWriter ref = null;
		try {
			ref = new PrintWriter("C:/FILEIO/help.txt");
			ref.println("JSpiders");
			ref.println("QSpiders");
			ref.println("PySpiders");
			ref.println(100);
			ref.println();
			ref.print("Java ");
			ref.println("Developer");
			ref.flush();
			System.out.println("Write Complete");
		}
		catch(IOException e) {
			e.printStackTrace();
		}
		finally {
			ref.close();
		}
	}
}
