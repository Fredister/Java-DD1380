import java.util.Scanner;
import java.lang.Math;


/*  Problem A - Boff
 * 
 * KTH Course: DD1380 Java Programming for Python Programmers
 * 
 * Written by: Fredrik Mazur
 * Email:	fomazur@kth.se
 * 
*/

public class Boff {
	
	
	public static void main(String[] args) {
		
		int n;
		int a;
		int b;
		int boff;
	
		
		Scanner in;
		
		in = new Scanner(System.in);
		
		//System.out.println("Enter the number you want to have as n, a, b: ");
		n = in.nextInt();
		a = in.nextInt();
		b = in.nextInt();
		//System.out.println("You picked n = " + n);
		//System.out.println("You picked a = " + a);
		//System.out.println("You picked b = " + b);
		
		if (n>99 || n <2 ){
			
			System.out.println("n has to be within 2<n<99");
	
		} 
		
		boff = 0;

		for (int i = a; i<=b; i++){
			
			// int last = check_last_Digits(n);
			
			int last_digit_match = check_last_Digits(i, n);
			
			
			if(i%n==0 || last_digit_match == 1) {
				
				boff ++;
			}
		}
		
		
		
		System.out.println(boff);
		
		in.close();

		
	}
	
	public static int check_last_Digits(int number, int n) {
		
	
		String temp = Integer.toString(number);
		
		//System.out.println(temp);
		
		
		int length_n = String.valueOf(n).length();
		int length_number = String.valueOf(number).length();
		//System.out.println(length_n);
		
		if (length_n == 1) {
			
			String last = temp.substring(length_number-1);
			//System.out.println(last);
			
			int last_int = Integer.parseInt(last);
			
			if (last_int == n) {
				
				return 1;
			}
			
			else {
				
				return 0;
			}
		}
		
		if (length_n == 2 && number > 9) {
			
			String last = temp.substring(length_number-2);
			// System.out.println("This is the last: " + last);
			
			int last_int = Integer.parseInt(last);
			
			if (last_int == n) {
				
				return 1;
			}
			
			else {
				
				return 0;
			}
			
		}
		return 0;

		
	
	} 
	
	

}

