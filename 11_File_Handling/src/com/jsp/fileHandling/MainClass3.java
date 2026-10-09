package com.jsp.fileHandling;

import java.io.File;

//Delete a File or folder |It is a Permanent Delete Operation
public class MainClass3 {
	public static void main(String[] args) {
		
		//File ref = new File("C:/FILEIO/Demo.txt");//deleting the file
		
		File ref = new File("C:/FILEIO");//To delete the Folder
		
		boolean flag = ref.exists();
		if(flag == true) {
			ref.delete();
			System.out.println("Deleted....");
		}
		else {
			System.out.println("File Or Folder Does not exists.....");
		}
	}
}
