package javaBasic4;

public class VariableAsReturnType {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		VariableAsReturnType obj=new VariableAsReturnType();
		obj.fruitName("red");
		obj.buySoapAndReturnMeSoap(30);
		obj.buySoapAndReturnMeBalance(100);
		

	}

	
	public String fruitName(String fruitcolour) {
		System.out.println("The colour of this fruit is "+fruitcolour+" which looks good");
		String fruitname = "Apple";
		System.out.println("Bought "+fruitname+ " fruit");
		return fruitcolour;
	}
	
	public String buySoapAndReturnMeSoap(int soapAmount) {
//		System.out.println("bought soap for 10 rupees");
		System.out.println("Bought soap for the given amount"+ soapAmount+ " rupees");
//		return "Hamam";
		String soapName = "Hamam";
		System.out.println("Bought "+soapName+ " soap");
		return null;
	}
	
	
	public int buySoapAndReturnMeBalance(int soapAmount) {
		System.out.println("bought soap for 10 rupees");
//		return soapAmount - 10;
//		return 0;
		int balanceAmount = soapAmount - 10;
		return balanceAmount;
		
	}
}
