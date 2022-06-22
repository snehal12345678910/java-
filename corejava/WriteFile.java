package corejava;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class WriteFile {
	

		  public static void main(String[] args) throws IOException {
		    
		      FileWriter file = new FileWriter("D:\\Text Document.txt");
		      
		      BufferedWriter buff=new BufferedWriter(file);
		      String text="hello.........this is my home";
		      
		      buff.write(text);
		      buff.close();
		     
		    }        
}	
	


