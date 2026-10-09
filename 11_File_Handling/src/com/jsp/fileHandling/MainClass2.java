package com.jsp.fileHandling;

import java.io.File;
import java.io.IOException;

//Creating a File inside the Folder
public class MainClass2 {
	public static void main(String[] args) {
		File ref = new File("C:/FILEIO" , "Sample.txt"); //File(Location, FileName)
		boolean flag = ref.exists();
		if(flag == false ) {
			try {
				ref.createNewFile(); //Creating new File Here
				System.out.println("File Created.....");
			}
			catch(IOException e) {
				e.printStackTrace();
			}
		}
		else {
			System.out.println("File Already Exists....");
		}
	}
}
