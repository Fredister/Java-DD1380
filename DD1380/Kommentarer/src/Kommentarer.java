import java.util.Scanner;
import java.util.Arrays;

/*  Problem D - Kommentarer
 *
 * KTH Course: DD1380 Java Programming for Python Programmers
 *
 * Written by: Fredrik Mazur
 * Email:	fomazur@kth.se
 *
*/

public class Kommentarer {
	
	


public static void main(String[] args) {

	Scanner scan = new Scanner( System.in );
	StringBuffer buf = new StringBuffer();

	while (scan.hasNextLine()) {

	  buf.append( scan.nextLine());
	  buf.append("\n");

	}

	String s = buf.toString();
	while(s.contains("%") || s.contains("/*")) {
		
		s = find_comment(s);

	}
	System.out.print(s);
	


	    }


public static String find_comment(String s) {
	

	char[] ch = new char[s.length()];
	

	 for (int i = 0; i < s.length(); i++) {
		 
		 ch[i] = s.charAt(i);
		 
	 }
	 
	 int[] Percent = new int[100];
	 int[] Star_start = new int[100];
	 int[] Star_close = new int[100];
	 Arrays.fill(Percent, -1);
	 Arrays.fill(Star_start, -1);
	 Arrays.fill(Star_close, -1);

	 
	 int place_per = 0;
	 
	 int place_start = 0;
	 int place_end  = 0;
	 
	
	 
	int tot_length = s.length();

	 for (int i=0; i<s.length();i++) {

		 	
		 if(ch[i] == '%' || ch[i] == '/') {
	
			 
			 if(ch[i] == '%') {
				 
				 Percent[place_per] = i;
				 place_per++;			 	 	 		 
			 }
			 
			 else if(i != s.length()-1 && ch[i] == '/' && ch[i+1] =='*') {
				 
					
				 
				 Star_start[place_start] = i;
				 place_start++;			 	 	 
				 
			 }
			 
			 
			 else if(i != 0 && ch[i] == '/' && ch[i-1] =='*') {

				 Star_close[place_end] = i;
				 place_end++ ;
				 
			 }  

			 
			 
			
		 } 
	 }
	 
	 String new_s1 = "";
	 String new_s2 = "";

		 
		 if (Percent[0] != -1 && Star_start[0] != -1) {
			 
			 if(Percent[0] <= Star_start[0]) {
				 
			
				 if(Percent[0]!=-1 && Percent[1]==-1) {
					 
					 new_s1 = s.substring(0,Percent[0]);
					 s = new_s1;				 					 				
					 
				 }
		
			
				 else {
					 
					 new_s1 = s.substring(0,Percent[0]);
					 new_s2 = s.substring(Percent[1]+1,s.length()-1);
					 s = new_s1+new_s2;
					 		 
				 }
				 
				 }
			 
			 else {
				 
				 if(Star_close[0]!=-1) {
					 
					 for(int i=0; i<Star_close.length;i++) {
						 
						 if(Star_start[0]<Star_close[i] && Star_close[i] != s.length()-2) {
							 
							
							 
							 
							 new_s1 = s.substring(0,Star_start[0]);
							 
							 
							 if(Star_close[i]+1 == tot_length-1) {
								 
								 s = new_s1;
							 }
							 
							 else {
								 
								 new_s2 = s.substring(Star_close[i]+1,s.length()-1);
								 s = new_s1+new_s2;
								 
								 
							 }
							
							 break;
		 
						 }
						 
						 new_s1 = s.substring(0,Star_start[0]);
						 s = new_s1;
						 break;
			
				 }
					 
				 
				 }
				 
				 else {
					 
					 new_s1 = s.substring(0,Star_start[0]);
					 s = new_s1;
				 }
	 
			 }}
	
	   	 
		 
		 else if(Percent[0] != -1 && Star_start[0] == -1) {
			  
			 if(Percent[0]!=-1 && Percent[1]==-1) {
				 new_s1 = s.substring(0,Percent[0]);
				 s = new_s1;
	 
				 
			 }
			 
			 else {
				 new_s1 = s.substring(0,Percent[0]);
				 new_s2 = s.substring(Percent[1]+1,s.length()-1);	
				 s = new_s1+new_s2;
				 
			 }
	
			 
		 }
		 
		 else if(Percent[0] == -1 && Star_start[0] != -1){
			 
			 
			// System.out.print("\nStart: " + Star_start[0]);
			 //System.out.print("\nClose: " + Star_close[0]);

			 if(Star_close[0]!=-1) {
				 
				 for(int i=0; i<Star_close.length;i++) {
					 
					 if(Star_start[0]<Star_close[i] && Star_close[i] != s.length()-2) {
	
						 new_s1 = s.substring(0,Star_start[0]);
						 
						 
						 if(Star_close[i]+1 == tot_length-1) {
							 
							 s = new_s1;
						 }
						 
						 else {
							 
							 new_s2 = s.substring(Star_close[i]+1,s.length()-1);
							 s = new_s1+new_s2;

						 }
						
						 break;
	 
					 }
					 
					 new_s1 = s.substring(0,Star_start[0]);
					 s = new_s1;
					 break;

				 }}
			 
			 else {
				 
				 new_s1 = s.substring(0,Star_start[0]);
				 s = new_s1;
			 }

		 }


		return s;
			 

} 
} 

	
	
	


