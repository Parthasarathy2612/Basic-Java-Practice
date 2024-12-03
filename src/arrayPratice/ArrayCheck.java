package arrayPratice;

public class ArrayCheck {
	
	static String[]chcolate= {"Dariy milk", "milkybar", "bommer", "kitkat", "Melody"};
	
	public static void main(String[] args) {
		ArrayCheck obj = new ArrayCheck();
//		  obj.arraycheck();
//		  StringArray();
		
	//	obj.CommonArrayCheckForLoop(chcolate);
		
		obj.valueCheckInArray(chcolate, "candy" );
		
	//	obj.getGivenIndexValueFromArray(chcolate, 4);
	}
	
	
	
	public void arraycheck () {
		
		String[]stringarv = new String[5];
		
		stringarv[0]="APPLE";
		stringarv[1]="choki";
		stringarv[2]="milk";
		stringarv[3]="ice cream";
		
//		System.out.println(stringarv[3]);
		System.out.println("Length of array is "+ stringarv.length);
		
	}
	
	
	public static void StringArray () {
//		String[]fruits= new String[5];
		String[]fruits= {"apple", "grapes", "mango", "papaya", "orange"};
		
		System.out.println("Getting array values using basic for loop: ");
		
		for (int i=0; i<fruits.length-1; i++) {
			System.out.println(fruits[i]);
		}
	}	
	public void CommonArrayCheckForLoop (String[] stringName) {
	
		for(int i=0; i<stringName.length; i++) {
			System.out.println(stringName[i]);

		    }
}
	
	public String getGivenIndexValueFromArray(String[] arrayName, int index) {
		System.out.println(arrayName[index]);
		return arrayName[index];
	}
	
		//To check Given Value Is present in array
	public void valueCheckInArray(String[] arrayName, String value) {
		int temp =0;
		for(int i=0; i<arrayName.length; i++) {
			if (arrayName[i] == value) {
				temp=1;
				break;
			}
	}
		if (temp==1){
			System.out.println("The value is present in the array "+ value);			
		}
		else
		System.out.println("The "+value+" is not present in the array");
		
	}
	
	
	
	
	
	
}
		

	
	
	


