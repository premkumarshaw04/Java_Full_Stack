package com.jsp.filePermission;

import java.io.File;
import java.io.IOException;

public class Program2 {
	public static void main(String[] args) throws IOException{
		File ref = new File("C:/FILEIO/perm.txt");
		boolean flag = ref.exists();
		if(flag == false) {
			ref.createNewFile();
			System.out.println("File Created....");
			ref.setReadable(false);
			ref.setWritable(false);
			ref.setExecutable(false);
			System.out.println("Permission Assigned...");
		}
		else {
			System.out.println("Readable: " + ref.canRead());
			System.out.println("Writable: " + ref.canWrite());
			System.out.println("Executable: " + ref.canExecute());
		}
	}
}
//Output:

//File Created....
//Permission Assigned...

