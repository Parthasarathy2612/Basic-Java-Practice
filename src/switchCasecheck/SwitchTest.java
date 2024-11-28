package switchCasecheck;

public class SwitchTest {

public void supermarket (int price) {
		
		switch (price){
		case 1000 :
			System.out.println("The total bill of your purchase is "+ price +" card or cash?");
			break;
		case 2000 :
			System.out.println("The total bill of your purchase is "+ price);
			break;
		case 2050 :
			System.out.println("The total bill of your purchase is "+ price);	
			break;
		default:
			System.out.println("The total bill of your purchase is "+ price);
			
			int a = price;
			
		}
		
	}



public void bakery (String SnackName) {
     
	  switch (SnackName) {
	  
	  case "Bread":
		  System.out.println (SnackName+ ", is ready,  anything eles sir/mam" );
	  break;
	  case "pufzz":
		  System.out.println ("The Snack you broght is  "+SnackName+",  anything eles sir/mam" );
	  break;
	  case "plain cake":
		  System.out.println ("The Snack you broght is  "+SnackName+",  anything eles sir/mam" );
	  break;
	  
	  default:
		  System.out.println ("Delisious "+SnackName+", is ready, anything eles sir/mam" );
	  
	  }
		
	
	
}

	public static void main(String[] args) {
		SwitchTest obj =new SwitchTest();
		 
//		obj.supermarket(90);
		obj.bakery("pufzz");
	}
	
	
}
