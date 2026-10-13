package com.jsp.filePermission;

import java.io.File;

public class Program1 {
	public static void main(String[] args) {
		File ref = new File("C:/FILEIO/log.txt");
		System.out.println("Readable: " + ref.canRead());
		System.out.println("Writable: " + ref.canWrite());
		System.out.println("Executable: " + ref.canExecute());
	}
}
//Output:

//Readable: true
//Writable: true
//Executable: true