package com.jsp.fileHandling;

import java.io.File;

//CREATE A FOLDER OR DIRECTORY
public class MainClass1 {
	public static void main(String[] args) {
		File ref = new File("C:/FILEIO");
		boolean bool = ref.exists();
		if(bool == false) {
			ref.mkdir();
			System.out.println("Folder Created....");
		}
		else {
			System.out.println("Folder Already Exists....");
		}
	}
}
