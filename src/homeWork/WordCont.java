package homeWork;

public class WordCont {

//	String word= "Hi My name is Parth";
	
	
	public void words() {		
		String word= "Hi My name is Parth";
		String [] inputWord = word.split("\\s+");
		int count = inputWord.length;
		System.out.println("The no. of words in a Sentence is "+ count);
		}	
	
	public void words1 () {
		String word= "Hi My name is Parth";
		String [] inputWord = word.split("\\s+");
		for (String eachcount :inputWord) {			
	}
		String []eachcount=inputWord;
		int a = eachcount.length;
		System.out.println(a);
	}
	

	
	public static void main(String[] args) {
	
		WordCont obj =new WordCont();
//    	obj.words();
		obj.words1();
		
	}

}
