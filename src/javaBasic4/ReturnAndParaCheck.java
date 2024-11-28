package javaBasic4;

public class ReturnAndParaCheck {
	
	
	String shop1 ="Reliance trends";
	static	String shop2="panthaloons";
	
	 String shop4bill= "your total bill is 300";

	public static void main(String[] args) {
		ReturnAndParaCheck shopping = new ReturnAndParaCheck();
		permburArea Shopping = new permburArea();
		
		shopping.buyTshirt("Zudio");//direct value or HardCoded
        shopping.buyTshirt(shopping.shop1);//non static local variable
        shopping.buyTshirt(shop2);// static local variable
        shopping.buyTshirt(Shopping.shop1);// using non static variable form another class
        shopping.buyTshirt(permburArea.shop2);// using static variable form another class
  ///////////////////////////////////////////////////////////////////////////////////////////////////////////      
        //returntype method usage check//
        String shop3bill= shopping.billingSection();//we are assigning a retuntype method to local variable
        System.out.println(shop3bill);
        
        System.out.println(shopping.shop4bill);
     //   String shop4bill = shopping.billingSection();/// this is not working for me, still getting older value of shop4bill variable
    //    System.out.println(shopping.shop4bill);
        shopping.shop4bill = shopping.billingSection();
        System.out.println(shopping.shop4bill);

        
        shopping.offertshirt(shop3bill);/// we are assigning retuntype method to parameterziation method
        
        String onlineshop=Shopping.onlineshopping();
        shopping.buyTshirt(onlineshop);
        
        
        
	}
 
	
	public void buy1tshirt () {
		System.out.println("Buy T-shirt online");
	}
	
	
	public void buyt2shirt () {
		System.out.println("Buy T-shirt ofline");
		
	}
	
	
	public void buy3tshirt () {
		System.out.println("Buy T-shirt online");
		
	}
	
	public void buyTshirt (String ShopName) {   ///parameterziation
		System.out.println("Buy T-shirt in "+ShopName+" via online");
	}
	
	
	public void offertshirt(String offerprice) {
		System.out.println("Hello "+offerprice+" Thanks for the purchase");
	}
	
	public String billingSection() { ///Retuntype
		return "Your Total bill amount is Ruppes 500";
		
	}

	
}

class permburArea{
	String shop1 ="perambur Reliance trends";
	static	String shop2="perambur panthaloons";
	
	public String onlineshopping() {
		return"Max";
	}
	
}

/////////////////////////////////////////////////////////////////////////////////////////////////////      












