package exceptionCheck;

public class ExceptionCheck {
	
String abc= "alpha";
	String dfg="beta";
	
	public String check () {
		System.out.println("To check the outside oftry block");
		System.out.println(abc);
		return dfg;
		
	}

	public static void main(String[] args) {
		ExceptionCheck obj = new ExceptionCheck();
		obj.check();
		
		int a = 100;
		int b = 0;
		int c ;
		try {
			c = a / b;
			System.out.println("To check the try block");
		}
    	catch(Exception e) {
//			System.out.println(e.getMessage());
		}
//		catch(RuntimeException e) {
//			System.out.println(e.getMessage());
//		}
//		catch(IOException e) {
//		System.out.println(e.getMessage());
//		}
//		catch (NullPointerException e) {
//			System.out.println("We have captured the null pointer exception");
//			System.out.println(e.getMessage());
//		} 
//	catch (ArithmeticException e) {	
//			System.out.println(e.getMessage());
//		}
	    finally {
			System.out.println("aaa");
//		}

		System.out.println("hello");
	}

	}

}
