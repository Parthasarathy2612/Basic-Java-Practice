package javaBasic4;

public class RetunTypeCheck {

	
	public String netflix (String SeriesName) {
		System.out.println("One of the famous series is "+ SeriesName);
		return SeriesName ;
		
	}
	
	public int SeriesEpisode (int chapter, int Episode) {
		System.out.println (" chapter "+chapter+" Episode "+ Episode);
		return (chapter)+ (Episode) ;
	}
	
	
	
	
	
	
	
	public static void main(String[] args) {
		RetunTypeCheck obj = new RetunTypeCheck();
//		obj.netflix("Baki");
		obj.SeriesEpisode(5, 15);
	}

}
