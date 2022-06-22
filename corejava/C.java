package corejava;// polymorphisam


	class A {
		public void Bird1() {
			System.out.println("tweet tweet tweet");
		}
	}
	 class B extends A {
		  
		 public void Bird2(String song) {
			  System.out.println("sweet sweet sweet");
			  
		 }  
			  
	 }
	 class D extends A{
		 public void Bird3() {
			 System.out.println("blaa blaa blaa");
		 }
	 }
	public class C {
	    	
		public static void main(String[] args) {
            			
		  //B b=new B();
		  //b.Bird2();
		  D d=new D();
		  d.Bird3();
		  A a=new A();
	       a.Bird1();
		}
		
	}


