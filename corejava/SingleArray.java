package corejava;

public class SingleArray {
public static void main(String[] args) {
		
		int arr[]=new int[5];
		
		arr[0]=100;
		arr[1]=200;
		arr[2]=300;
		arr[3]=400;
		
		System.out.println(arr[2]);
		
		for(int i=0;i < arr.length; i++) {//read all the data from array
		System.out.println(arr[i]);
			
    }
}}