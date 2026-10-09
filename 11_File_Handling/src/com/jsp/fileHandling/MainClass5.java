package com.jsp.fileHandling;

import java.io.File;

public class MainClass5 {
	public static void main(String[] args) {
		File ref = new File("C:/FILEIO");
		String[] arr = ref.list();
		for(String s : arr) {
			System.out.println(s);
		}
	}
}

//Output: 

//bin
//Demo.txt
//Example.txt
//ext
//Sample.txt
//src
