package com.jsp.reader;

import java.io.FileReader;
import java.io.IOException;

//FileReader : It will read character by character.
public class MainClass11 {
	public static void main(String[] args) {
		FileReader ref = null;
		try {
			ref = new FileReader("C:/FILEIO/rough.txt");
			int val = ref.read();
			while(val != -1) {
				System.out.println((char)val);
				val = ref.read();
			}
		}
		catch(IOException e) {
			e.printStackTrace();
		}
		finally {
			try {
				ref.close();
			}
			catch(IOException e) {
				e.printStackTrace();
			}
		}
	}
}
//Output:
//A
//p
//p
//l
//e
//
//
//
//
//B
//a
//n
//a
//n
//a
//
//
//
//
//a
//
//
//
//
//M
//a
//n
//g
//o








