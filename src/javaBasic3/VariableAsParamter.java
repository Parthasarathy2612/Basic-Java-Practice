package javaBasic3;

public class VariableAsParamter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		VariableAsParamter obj =new VariableAsParamter ();
		obj.buySoap("lux", 100);
		obj.loginAmazonApplication("Partha", "Apple@123");
	}
	
	
	public void buySoap(String soapName, int soapAmount) {
		System.out.println("Buy "+soapAmount+ " rupees "+soapName+ " soap");
	}
	
	public void loginAmazonApplication(String userName, String password) {
		
		System.out.println("Enter "+userName+ " in Amzaon login page's username box ");
		System.out.println("Enter "+password+ "in Amzaon login page's password box");
		
	}
	
	
	
}
