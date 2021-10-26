import java.util.Scanner;
import java.util.Arrays;

/*  Problem C - Ord till tal
 * 
 * KTH Course: DD1380 Java Programming for Python Programmers
 * 
 * Written by: Fredrik Mazur
 * Email:	fomazur@kth.se
 * 
*/



public class Ordtilltal {
	
	public static void main(String[] args) {
		
		
		Scanner input;
		input = new Scanner(System.in); // Declaring scanner
		
		String num_input="";
		
        num_input+=input.nextLine();
        
        // System.out.println("Input is:" + name);
        
        String[] inputs = num_input.split(" ");	// Split at blanks
        
  
        // Need to be long in order to cover all numbers 
        
        long temp_num = 0;
        long result = 0;
        
        
        for(int i=0; i<inputs.length; i++) {
        	
	
		if (inputs[i].equals("ett")) {
	
			temp_num += 1;
		}
		
		else if(inputs[i].equals("en")) {
			
			temp_num += 1;
		}
		
		else if (inputs[i].equals("två")) {
			
			temp_num += 2;
		}
		
		else if (inputs[i].equals("tre")) {
			
			temp_num += 3;
		}
		
		else if (inputs[i].equals("fyra")) {
			
			temp_num += 4;
		}
		
		else if (inputs[i].equals("fem")) {
			
			temp_num += 5;
		}
		
		
		else if (inputs[i].equals("sex")) {
			
			temp_num += 6;
		}
		
		else if (inputs[i].equals("sju")) {
			
			temp_num += 7;
		}
		
		else if (inputs[i].equals("åtta")) {
		
			temp_num += 8;
		}
		
		else if (inputs[i].equals("nio")) {
			
			temp_num += 9;
		}
		
		else if (inputs[i].equals("tio")) {
			
			temp_num += 10;
		}
		
		else if (inputs[i].equals("elva")) {
			
			temp_num += 11;
		}
		
		else if (inputs[i].equals("tolv")) {
			
			temp_num += 12;
		}
		
		else if (inputs[i].equals("tretton")) {
			
			temp_num += 13;
		}
		
		else if (inputs[i].equals("fjorton")) {
			
			temp_num += 14;
		}
		
		else if (inputs[i].equals("femton")) {
			
			temp_num += 15;
		}
		
		else if (inputs[i].equals("sexton")) {
			
			temp_num += 16;
		}
		
		else if (inputs[i].equals("sjutton")) {
			
			temp_num += 17;
		}
		
		else if (inputs[i].equals("arton")) {
			
			temp_num += 18;
		}
		
		else if (inputs[i].equals("nitton")) {
			
			temp_num += 19;
		}
		else if (inputs[i].equals("tjugo")) {
			
			temp_num += 20;
		}
		
		else if (inputs[i].equals("trettio")) {
			
			temp_num += 30;
		}
		
		else if (inputs[i].equals("fyrtio")) {
			
			temp_num += 40;
		}
		
		else if (inputs[i].equals("femtio")) {
			
			temp_num += 50;
		}
		
		else if (inputs[i] == "sextio") {
			
			temp_num += 60;
		}
		
		else if (inputs[i].equals("sjuttio")) {
			
			temp_num += 70;
		}
		
		else if (inputs[i].equals("åttio")) {
			
			temp_num += 80;
		}
		
		else if (inputs[i].equals("nittio")) {
			
			temp_num += 90;
		}
		
		else if (inputs[i].equals("hundra")) {
			
			temp_num *= 100;
		}
		
		else if (inputs[i].equals("tusen")) {
			
			temp_num *= 1000;
			result += temp_num;
			temp_num = 0;
		}
		
		else if (inputs[i].equals("miljon")) {
			
			temp_num *= 1000000;
			result += temp_num;
			temp_num = 0;
		}
		
		else if (inputs[i].equals("miljoner")) {
			
			temp_num *= 1000000;
			result += temp_num;
			temp_num = 0;
		}
		
		else if (inputs[i].equals("miljard")) {
			
			temp_num *= 1000000000;
			result += temp_num;
			temp_num = 0;
		}
		
		else if (inputs[i].equals("miljarder")) {
			
			temp_num *= 1000000000;
			result += temp_num;
			temp_num = 0;
		}
		

        }
        result += temp_num;
		temp_num = 0;
        
        System.out.println(result);
        
        
	
	}
		 
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	


