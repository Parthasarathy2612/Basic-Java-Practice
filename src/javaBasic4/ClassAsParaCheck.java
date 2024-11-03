package javaBasic4;

public class ClassAsParaCheck {

	public static void main(String[] args) {
		ClassAsParaCheck Cls = new ClassAsParaCheck();

		Cls.Method1(Cls);
		
		Cls.Method2(Cls.Method3());//combining both return type and parameters
		
		
	}

	public void Method1(ClassAsParaCheck check) {//class as a parameter 
		
	}
	
	public void Method2(String string) {
		System.out.println("the rating for the "+string+ " movie is");
		
	}
	
	public String Method3() {
	String Rating= "5 rating";
		return Rating;
		
	}
	
	public ClassAsParaCheck Method4 () {// class as a retuntype
		ClassAsParaCheck cls = new ClassAsParaCheck();
		return cls;
	}

}

class base {
	public base Method4() {
		return new base();
	}
}


