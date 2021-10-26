import java.util.Scanner;
import java.util.Arrays;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.regex.*;


/*  Problem C - Ord till tal
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
	int i_1 = 1;
	int i_2 = 1;

	while (scan.hasNextLine()) {
		i_1 = buf.length();

	  buf.append( scan.nextLine());
	  buf.append("\n");

	    //System.out.print("\nThis is buf: " + buf);
	    //System.out.print("I_1: " + i_1 + " i_2: " + i_2);

	    if (i_1 == i_2) {

	    	break;

	    }
	    i_2 = i_1;

	}


	String s = buf.toString();

  int s_length = s.length();

	int first_percent = s.indexOf('%');
	int second_percent = 0;


	if (first_percent != -1){
		second_percent = s.substring(first_percent+1).indexOf('%');

		second_percent = first_percent + second_percent;



	}

	String s1 = s.substring(0,first_percent-1);
	String s2 = s.substring(second_percent+2, s_length-1);

	s = s1 + s2;


	System.out.print("First %: " + first_percent);
	System.out.print("\nSecond %: " + second_percent);

	System.out.print("\nThis is s: " + s);




	    }
	}

	
	
	


