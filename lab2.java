package day14_Method2;

public class lab2 {

	public static void main(String[] args) {
	
      love6(6,4);
      love6(4,5);
      love6(5,1);
      love6(12,6);
	}
	
	
	public static void love6(int num1,int num2) {
		
		if(num1==6 ||num2==6 ||num1+num2==6 || num1-num2==6 || num2-num1==6) {
			System.out.println(true);
			
		}else {
			System.out.println(false);
		}
		
		
	}

}
