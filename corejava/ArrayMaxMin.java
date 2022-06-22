package corejava;

public class ArrayMaxMin {

	public static void main(String[] args) {
		
		int arr[]= {2,5,8,78,56,94,3,4};
			
			int max=arr[0];
			int min=arr[0];
			for (int i=0;i<arr.length;i++) {
				
				if(arr[i]>max) {
					max=arr[i];
			}
				if(arr[i]<min) {
					min=arr[i];
				}
			}
		
		      System.out.println(max);//print statement
		      System.out.println(min);//print statement
		      
		}		
	}
