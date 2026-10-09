package com.jsp.fileHandling;

import java.io.File;

public class MainClass7 {
	public static void main(String[] args) {
		File ref = new File("C:/FILEIO");
		String[] arr = ref.list();
		for(String s : arr) {
			File obj = new File(ref, s);
			if(obj.isDirectory() == true) {
				System.out.println(s);
			}
		}
	}
}

//Output: 

//bin
//ext
//src

