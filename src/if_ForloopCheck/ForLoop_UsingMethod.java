package if_ForloopCheck;

public class ForLoop_UsingMethod {

	public static void main(String[] args) {
//		method1();
		ForLoop_UsingMethod obj =new ForLoop_UsingMethod ();
		
//		obj.latterPatternWithNumber();
		
//		obj.Stratpaten();
//	}
	
//	public static void method1() {
//		for (int i = 1; i <= 5; i++) {
//		if (i == 4)
//			System.out.print(" * ");
//			else 
//				System.out.print(i+" ");
//		}
//	}
//123*5		
//	public void latterPatternWithNumber() {
//		for (int i = 1; i <= 5; i++) {

//			for (int j = 1; j <= i; j++) {
//				System.out.print(i + " ");
//			}

//			System.out.println();
//		}

//}
//	1
//	22
//	333
//	4444
//	55555
//	|
//	public void Stratpaten() {
//	for (int i = 5; i > 0; i--) {
//		for (int j = 1; j <= 5; j++) {
//			if (i <= j) {
//				System.out.print("*");
//			}
//			else 
//				System.out.print(" ");
//		}
//		System.out.println();
	//}
//}
		
//    *
//   **
//  ***
// ****
//*****	{
//	for (int i = 1; i <= 5; i++) {

//		for (int j = 1; j <= 5; j++) {
//			int a = 0;
//			if (i >= j) {
//				a = 1;
//				System.out.print(j + " ");
//			} else {
//				break;
//			}

//		}

//		System.out.println();
//	}

	
	
	
//		obj.forloopcheck();
	
	
//}
	
//	public void forloopcheck () {
//		int a=1;
//		for (int i=1; i<=5; i++) {
//			for(int j=1; j<=5; j++) {
//				if (i==j) {
//					System.out.print(j+" ");
//				} 
//				else {	
//					System.out.print(a+ " ");
//				}					
//			}				
//			System.out.println();
//		}			
//	}
			
	
	
	//1 1 1 1 1
	//1 2 1 1 1
	//1 1 3 1 1
	//1 1 1 4 1
	//1 1 1 1 5
	
		forloopcheck1 ();

	}
	public static void forloopcheck1 () {
		
		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <= 5; j++) {
				if (j == i) {
					System.out.print(j);
					break;
				} else
					System.out.print(" ");
			}
			System.out.println();
	
	
	
	
}	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
   }

}

