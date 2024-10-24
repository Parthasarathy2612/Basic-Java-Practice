package javaBasic1;

public class ClassA {

	int A1 =10;
	public String product = "apple";
	private int A2= 1;
	protected int A3 = 40;
	
	static int A4 = 10;
	static public int A5 = 20;
	private static int A6 = 30;
	static protected int A7 = 40;
	
	public void Method1 () {
		
		System.out.println(A1);
		System.out.println(product);
		System.out.println(A2);
		System.out.println(A3);
		
		System.out.println(A4);
		System.out.println(A5);
		System.out.println(A6);
		System.out.println(A7);
		
		
		
	}
	
   public static void Method2 () {
	
	   ClassA obj=new ClassA ();
	   System.out.println(obj.A1);
		System.out.println(obj.product);
		System.out.println(obj.A2);
		System.out.println(obj.A3);
		
		System.out.println(A4);
		System.out.println(A5);
		System.out.println(A6);
		System.out.println(A7);
		
	}
	
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
