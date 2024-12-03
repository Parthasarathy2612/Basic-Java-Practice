package homeWork;

public class StringCheck {
	
	String a= "Parth";
	
	
	public void Apple () {
	      int c= 0;	      
		String b= "parth";
		for(int i=0; i< a.length();) {
			if (b.equalsIgnoreCase(a)) {
			c=(i++);			
			}				
//			else {
//				System.out.println("Unable to count due to mismatch of a=b, please check the string of a is equal to b");
//			}
//			break;
		}
		
		int d=1+c;
		System.out.println(d+" is the cout of a");
//		if (d!= b.length()) {
//			System.out.println("Unable to count due to mismatch of a=b, please check the string of a is equal to b");
//		}
//		else {
//			System.out.println(d+" is the cout of a");
//		}
		
		
		
		
		
	}
	
	

	public static void main(String[] args) {
		StringCheck obj=new StringCheck();
		obj.Apple();
		
		
		

	}

}
