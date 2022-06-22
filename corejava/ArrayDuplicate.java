package corejava;

public class ArrayDuplicate {
public static void main(String[] args) {
		
		int arr[]={78,89,56,45,48,78,48}; 
			
			for(int i=0;i<arr.length;i++) {
			for( int j=i+1;j<arr.length;j++) {
					
			if (arr[i]==arr[j]) {
			System.out.println(arr[j]);					
					}
				}
			}
		}
}
