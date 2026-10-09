package com.jsp.fileHandling;

import java.io.File;

public class MainClass4 {
	public static void main(String[] args) {
		File ref = new File("C:/FILEIO/Demo.txt");
		System.out.println(ref.length());//return the exact length of the content written inside the file
		System.out.println(ref.getAbsolutePath());
	}
}


//Output:
//25
//C:\FILEIO\Demo.txt