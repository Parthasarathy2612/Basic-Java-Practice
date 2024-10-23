package javaBasic;

public class MethodCheck {
//	With in A class
//	* Calling a static method from non-static method 
//			- Direct
//	* Calling a static method from static method 
//			- Direct
//	* Calling a non-static method from non-static method 
//			- Direct/ Object Creation
//	* Calling a non-static method from static method 
//			- Object Creation
	
	public void Method1 () {
		Method2();
		
		MethodCheck2 obj2=new MethodCheck2 ();
		obj2.Method6();
	}
	
	public static void Method2 () {
		Method4 ();
		MethodCheck2.Method5 ();
	}

   public void Method3 () {
	   Method1();
	   MethodCheck obj1= new MethodCheck ();
		obj1.Method1();
		
		MethodCheck2 obj2= new MethodCheck2();
		obj2.Method6();
	}
	
	public static void Method4 () {
		MethodCheck obj= new MethodCheck ();
		obj.Method1();
		
		MethodCheck2 obj3= new MethodCheck2();
		obj3.Method6();
		
	}

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

//Outside a class
//* Calling a static method of another class from non-static method 
//		- ClassName + static method name
//* Calling a static method of another class from static method 
//		- ClassName + static method name
//* Calling a non-static method of another class from non-static method 
//		- Object Creation
//* Calling a non-static method of another class from static method 

 
class MethodCheck2 {
	
	public static void Method5 () {
		
		
	}
	
    public  void Method6 () {
		
    	
	}
	
}











