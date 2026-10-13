package com.jsp.filePermission.activity;


import java.io.File;
import java.io.IOException;

//Creating a File inside the Folder
public class CreateFile {
	public static void main(String[] args) {
		File ref = new File("C:/FILEIO/ACTIVITY" , "C.txt"); //File(Location, FileName)
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
