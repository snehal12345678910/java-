package corejava;

import java.util.Scanner;

public class ScannerClass {
	
	public static void main(String[] args) {
		

		@SuppressWarnings("resource")
		Scanner sc=new Scanner(System.in);// object creation
		System.out.println("Enter the values");//print statement
		
		int First=sc.nextInt();
		int Second=sc.nextInt();
		
		int add=First+Second;
		System.out.println("Addition of the two values");
		
		System.out.println(add);
	}		
}		


		
		
		
	
	


