package day14_Method2;

public class lab1 {

	public static void main(String[] args) {
		
		stringTimes("hi",2);
		stringTimes("hi",3);
		stringTimes("hi",1);
		
		
		
	}
	
	public static void stringTimes(String words,int num) {
	   int copies;
		for(copies=1;copies<=num;copies++) {
			
			if(copies>0) {
				System.out.print(words);
				
				
			}
		}System.out.println("");
		
		
	}

}
