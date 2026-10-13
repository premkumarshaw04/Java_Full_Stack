package com.jsp.filePermission.activity;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;

//Interview Question: Quick Merge
public class Activity2 {
	public static void main(String[] args) throws IOException{
		BufferedReader reader1 = new BufferedReader(new FileReader("C:/FILEIO/ACTIVITY/A.txt"));
		BufferedReader reader2 = new BufferedReader(new FileReader("C:/FILEIO/ACTIVITY/B.txt"));
		PrintWriter writer = new PrintWriter("C:/FILEIO/ACTIVITY/C.txt");
		
		String line1 = reader1.readLine();
		String line2 = reader2.readLine();
		while(line1 != null || line2 != null) {
			if(line1 != null) {
				writer.println(line1);
				line1 = reader1.readLine();
			}
			if(line2 != null) {
				writer.println(line2);
				line2 = reader2.readLine();
			}
		}
		
		writer.flush();
		//Closing the resources.
		System.out.println("Mergeing Completed...");
		writer.close();
		reader1.close();
		reader2.close();
	}
}

