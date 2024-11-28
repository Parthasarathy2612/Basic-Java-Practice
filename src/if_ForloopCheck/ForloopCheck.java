package if_ForloopCheck;

public class ForloopCheck {

	
	public static void main (String [] args) {

//		for (int i = 2; i <= 5; i++) {
	//		method1();
//			System.out.println("***");
//			for (int j = 4; j <= 5; j++) {
		//		method2();
//				System.out.println("****");
//				for (int k=11; k >=11; k--) {
//					System.out.println("*******");
			//	     method3();
//				}
//			}
//		}
		
		
	//	for (int i=1; i<=5; i++) {
	//		for (int j=1; j<=2; j++) {
		//		System.out.print("*");
//			}
	//	}
		
		for (int i=1; i<=5; i++) {
			for (int j=1; j<=i; j++) {
				System.out.print("* ");
			}					
			System.out.println();
		}
	
//		        for (int i = 1; i <= 5; i++) {
//						for (int j = 1; j <=i; j++) {
//							System.out.print("* "); 
//						}
//					System.out.println();
//				}
					
		
		
		
		

	}

	public static void method1() {
		System.out.println("Hii");
	}

	public static void method2() {
		System.out.println("Hello");
	}

	public static void method3() {
		System.out.println("apple");
	}

	
	
	}

