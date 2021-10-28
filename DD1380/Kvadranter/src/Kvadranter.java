import java.util.Scanner;


import java.util.ArrayList;
import java.util.Arrays;

/*  Problem F - Kvadranter
*
* KTH Course: DD1380 Java Programming for Python Programmers
*
* Written by: Fredrik Mazur
* Email:	fomazur@kth.se
*
*/




public class Kvadranter {
	
	
	
	
	
	
	
	
	
	
	
	public static void main(String[] args) {
	
	
	
	
	Scanner s;
	s = new Scanner(System.in); // Declaring scanner
	
	/*String[] data = ;
	

	for(int i=0; i<2; i++){

        data[i] = s.nextLine();
        
        

        

} */
	String num_input="";
	String[] inputs = new String[2];
	
	for(int i=0; i<2; i++){
		
        //num_input+='\n'+s.nextLine();
        
        // System.out.println("Input is:" + name);
        inputs[i] = s.nextLine();
        
        
	}
	
	//System.out.print(num_input);
	
	
	System.out.print(inputs[1]);
	
	
	
	
	inputs[0] = inputs[0].replace(".","");
	System.out.print("\n" + inputs[0]+ " " + inputs[0].length());
	
	int n = inputs[0].length();
	
	int steps = (int) (Math.pow(2, n)-1);
	
	char[] ch = new char[n];
	
	int[] test = new int[n];
 for (int i = 0; i < n; i++) {
		 
		 test[i] = Character.getNumericValue(inputs[0].charAt(i))-1;

		 
	 }
	System.out.print("\n" + test[1]);
	
	int dec_num = 
	
	
	
	for(int i = n-1; i >=0; i--) {
		
		
	
	
	
	
}
}
}