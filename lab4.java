package day14_Method2;

public class lab4 {

	public static void main(String[] args) {
		
		deerPlay(70,false);
		deerPlay(95,false);
		deerPlay(95,true);
		

	}
	
	public static void deerPlay(int temp,boolean summer) {
		
		if(summer==false) {
			if(temp>=60 && temp<=90) {
				System.out.println(true);
				
				
			}else {
				
				System.out.println(false);
			}
			
		}else if(summer==true) {
			if(temp>=60&&temp<=100) {
				System.out.println(true);
			}else {
				System.out.println(false);
			}
		}
		
		
	}

}
