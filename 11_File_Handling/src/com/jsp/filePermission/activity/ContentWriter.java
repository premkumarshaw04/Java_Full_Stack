package com.jsp.filePermission.activity;

import java.io.IOException;
import java.io.PrintWriter;

//Using PrintWriter || Best Way
public class ContentWriter {
	public static void main(String[] args) {
		PrintWriter ref = null;
		try {
//			ref = new PrintWriter("C:/FILEIO/ACTIVITY/A.txt");
//			ref.println("Karnataka");
//			ref.println("TamilNadu");
//			ref.println("Telangana");
//			ref.println("Kerela");
//			ref.println("Puduchery");
			
			ref = new PrintWriter("C:/FILEIO/ACTIVITY/B.txt");
			ref.println("Bengaluru");
			ref.println("Chennai");
			ref.println("Haidrabad");
			ref.println("Cochin");
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
