import java.util.Scanner;
import java.util.Arrays;

/*  Problem B - Sumsort
 * 
 * KTH Course: DD1380 Java Programming for Python Programmers
 * 
 * Written by: Fredrik Mazur
 * Email:	fomazur@kth.se
 * 
*/


public class Sumsort {
	
	
public static void main(String[] args) {
		

		
		
		Scanner input;
		
		input = new Scanner(System.in); // Declaring scanner
		
	
		
		// System.out.print("Enter number: ");
		
		 int n = input.nextInt();	// Taking the sequence size as input
		 
		 int[] array = new int [n]; // Creating array with size n
		 
		 
		// string = input.nextLine();
		 
		// Takes the numbers as input
		 
		 
		for (int i = 0; i <n; i++)
		 {
			 
			 array[i] = input.nextInt();
			 
		 } 
		
		input.close(); // Close input 
		
		

		//String str= input.nextLine();   
		
		//System.out.println("You have entered: " + array[0]);
		
		/*for (int i = 0; i <n ; i++) {
			
			System.out.println(array[i] + " " );
		}*/
		
		Arrays.sort(array);	 // Using Arrays to sort from smallest to largest
		
		
		
		/*for (int i = 0; i <n ; i++) {
			
			System.out.print(array[i] + " " );
		}
		*/
		
		// If n is a multiple of 2 
		
		
		
		if (n%2==0) {
			
			int sum = 0;
			int breakpoint = n/2;
			
			// Counting "backwards" 
			
			for(int i = array.length-1; i>=breakpoint; i--) {
				//System.out.println(i);
				
				
				sum = sum + array[i];
				//System.out.println(array[i]);
	
				
			}
			
			
			System.out.println(sum);
				

			
		}
		
		// If n is odd
		
		else {
			
			int sum = 0;
			
			
			int breakpoint = (n-1)/2;
			
			for(int k = array.length-1; k>=breakpoint; k--) {
				
				// System.out.println(k);
				
				sum = sum + array[k];
				//System.out.println(array[i]);
	
				
			}
			
			
			
			System.out.println(sum);
			
			
			
			
			
		}
		
		

		
		
	}







	
}
