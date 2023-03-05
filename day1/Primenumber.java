package week.day1;

public class Primenumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int number = 13;
		int count = 0;
		
		
		
		for (int i = 1; i <=number; i++) {
			
			if (number % i ==0) {
				count++;
				
			}
			
		}
		
		if (count==2) {
			
			System.out.println("prime numner");
			
		}else {
			System.out.println("not prime number");
			
		}
		
		
		
		
	}

}
