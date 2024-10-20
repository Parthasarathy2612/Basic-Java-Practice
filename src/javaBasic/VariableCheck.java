package javaBasic;

public class VariableCheck {

	int productCount= 10;
	String productName= "Mango";
	static float kg= 10.5f;
	boolean goodQuality =true;
	static char qualityGrade ='A';
	
	
	static String st;

	
	
public void method1 () {
	String productName2= "grape";
//	static String productName5= "grape";
	System.out.println(productCount);
	System.out.println(kg);	
}	


private void method2 () {
	String productName3= "orange";
	System.out.println(productCount);
	System.out.println(kg);
	
}	

protected void Method3 () {
	String productName4= "pieapple";
	System.out.println(goodQuality);
	System.out.println(qualityGrade);
	
}


	public static void main(String[] args) {

		int productCount1= 05;
		String productName1= "APPLE";
	//	static float kg1= 10.5f;
		boolean goodQuality1 =false;
	//	static char qualityGrade1 ='A';
		char qualityGrade1 ='A';
		float kg1= 10.5f;
		
		VariableCheck obj1=new VariableCheck ();
		
		System.out.println(kg1);
		System.out.println(qualityGrade1);
		System.out.println(productCount1);
		System.out.println(productName1);
//		System.out.println(productName2);
		System.out.println(obj1.productCount); 
		System.out.println(obj1.goodQuality); 
		System.out.println(qualityGrade); 
		System.out.println(kg);
		
	}

}
