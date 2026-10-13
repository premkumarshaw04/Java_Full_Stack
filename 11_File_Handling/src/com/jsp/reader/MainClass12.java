package com.jsp.reader;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

//BufferedReader: It will read one line at a time.
public class MainClass12 {
	public static void main(String[] args) {
		BufferedReader ref = null;
		try {
			ref = new BufferedReader(new FileReader("C:/FILEIO/help.txt"));
			String str = ref.readLine();
			while(str != null) {
				System.out.println(str);
				str = ref.readLine();
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

//JSpiders
//QSpiders
//PySpiders
//100
//
//Java Developer



