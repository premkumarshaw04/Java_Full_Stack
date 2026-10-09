package com.jsp.fileHandling;

import java.io.File;

public class MainClass6 {
	public static void main(String[] args) {
		File ref = new File("C:/FILEIO");
		String[] arr = ref.list();
		for(String s : arr) {
			File obj = new File(ref, s);
			if(obj.isFile() == true) {
				System.out.println(s);
			}
		}
	}
}

//Output: 

//Demo.txt
//Example.txt
//Sample.txt

