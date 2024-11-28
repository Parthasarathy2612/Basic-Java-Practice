package exceptionCheck;

public class CustomException extends Exception{

	public static void main(String[] args) throws CustomException  {
		// TODO Auto-generated method stub
		throw new CustomException();
	}

	public  CustomException  () {
		System.out.println("Given number is less than 0. Please enter some other number");
	}
	
	public  CustomException (int a) {
		
	}
	
	public  CustomException  (int b, int c) {
		
	}
	
}
