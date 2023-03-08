package assignment2;

public class FindIntersection {

	public static void main(String[] args) {
		
//		 * Pseudo Code
//		 * a) Declare An array for {3,2,11,4,6,7};	 
//		 * b) Declare another array for {1,2,8,4,9,7};
//		 * c) Declare for loop iterator from 0 to array length
//		 * d) Declare a nested for another array from 0 to array length
//		 * e) Compare Both the arrays using a condition statement 
//		 *  f) Print the first array (shoud match item in both arrays)
		
		int[] a = {3,2,11,4,6,7};
		int[] b = {1,2,8,4,9,7};
		
		
	int	lent = a.length;
	int lent2 = b.length;
	
	boolean flag = false;
for (int i = 0; i <lent; i++) {
	for (int j = 0; j < lent2; j++) {
		
		if (a[i]==b[j]) {
			
			System.out.println("number value" + a[i]);
			flag = true;
			
			 if (flag==false) {
				 
				 System.out.println("No intersection");
				
			} else {

			}
		
		}
		
		
	}
	
}




	}


}
