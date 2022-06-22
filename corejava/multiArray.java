package corejava;

public class multiArray {
	public static void main(String[] args) {
		
		int arr[][]={ {1,2,3},{4,5,6},{7,8,9}};//multi diamentional metrix array
		
		for (int i=0;i<3;i++){//when this condition is satisfied {
			for(int j=0;j<3;j++) { //and this condition will satisfied
				
				System.out.print(arr[i][j]+" ");
				
			}
			 System.out.println();
			 
		}
	}

}
