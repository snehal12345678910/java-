package corejava;

public class variables {
	
	   int y=400;//outside the method within in the lass
	   static int z=300;//static used for another class access
      public void localVariable() {
    	  int x=100;
    	  System.out.println("value of x is ="+x);//within the class within the method  
      }
      public void Instancevariable()
      {
    	System.out.println("value of y is ="+y);
      
      }
      public static void main(String[]args) {
  }
}
