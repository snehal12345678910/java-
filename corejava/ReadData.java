package corejava;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ReadData {

	public static void main(String[] args) throws IOException {

	  //using file reader Buffer reader
	  
	  FileReader file=new FileReader("C:\\Users\\LENOVO\\Desktop\\FileReader.txt");
	  BufferedReader buff = new BufferedReader(file);
	  
		  String text;//creating variable
		  while ((text =buff.readLine()) != null) {
			 
			  System.out.println(text);		  
		  }
	}	  
}