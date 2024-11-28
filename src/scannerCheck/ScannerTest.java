package scannerCheck;

import java.util.Scanner;

public class ScannerTest {
	
	Scanner sc = new Scanner (System.in);
	
	
public void FreshJuiceshop(String Available_Juice, String JuiceName2,String JuiceName3, String JuiceName4, String JuiceName5 ) {
	System.out.println("Hi Sir/Mam Could you please select the juice from this menu");
	String Juice_Name =sc.next();
	System.out.println("one "+Juice_Name +" juice with low sugar & ice");
	if (Juice_Name.equalsIgnoreCase(Available_Juice)){
	System.out.println("Sir your "+ Juice_Name+ " juice is ready");
	}
	else
		System.out.println("Sir "+ Juice_Name+ " juice is not available in our shop, can you please check the menu one and select the available juice ");
	
	String Juice_Name1 =sc.next(); 
	System.out.println("I hope  "+Juice_Name1 +" is available as per your menu");
	
	switch(Juice_Name1){
		
	case "Kiwi" :
		System.out.println("Sorry Sir "+Juice_Name1+"  is not ripen yet, so it wont be good for preparing a juice for now. ");
		break;
	case "Apple":	
		System.out.println("Sir your "+ Juice_Name1+ "juice is ready");
		break;
	case "orange":	
		System.out.println("Sir your "+ Juice_Name1+ "juice is ready");
		break;
	case "ABC":	
		System.out.println("Sir your "+ Juice_Name1+ "juice is ready");
		break;	
	case "Pineappe":	
		System.out.println("Sir your "+ Juice_Name1+ "juice is ready");
		break;
		
	default:
	System.out.println("sorry Sir "+ Juice_Name1+ " is also not available in our shop, can you please check the menu one and select the available juice ");
	}
		
		
		
		
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
//	if (Juice_Name1.equalsIgnoreCase(Available_Juice)){
//		String temp = "Kiwi";
//		Available_Juice = temp;		
//		System.out.println("Sorry Sir "+Available_Juice+"  is not ripen yet, so it wont be good for preparing a juice for now. ");
///		System.out.println("Sir your "+ Juice_Name1+ "juice is ready");
//	} else
//		System.out.println("sorry Sir "+ Juice_Name1+ " juice is also not available in our shop, can you please check the menu one and select the available juice ");
		
	
//		else if(Juice_Name1.equalsIgnoreCase(Available_Juice)){
//			String temp = "kiwi";
///		Available_Juice = temp;
//		System.out.println("Sorry Sir "+Available_Juice+"  is not ripen yet, so it wont be good for preparing a juice for now. ");
///		
//		}
//		else
//			System.out.println("sorry Sir "+ Juice_Name1+ " is also not available in our shop, can you please check the menu one and select the available juice ");



}

  
	public static void main(String[] args) {
		ScannerTest obj =new ScannerTest ();
		obj.FreshJuiceshop("Apple", "orange", "ABC", "Pineappe", "Kiwi");
		

	}

}
