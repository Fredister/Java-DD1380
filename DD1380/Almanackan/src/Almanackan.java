import java.util.Scanner;
import java.util.ArrayList;
import java.util.*;


/*  Problem E - Almanackan
 * 
 * KTH Course: DD1380 Java Programming for Python Programmers
 * 
 * Written by: Fredrik Mazur
 * Email:	fomazur@kth.se
 * 
*/



public class Almanackan {

public static class Appointment implements Comparable<Appointment>{
	
	String month;
	int month_num;
	int day;
	String time;
	int time_num;
	String note;
	
	
	public Appointment(String month, int month_num, int day, String time,  int time_num, String note){
		
		this.month = month;
		this.month_num = month_num;
		this.day = day;
		this.time = time;
		this.time_num = time_num;
		this.note = note;
	
	}
	

	@Override
	public int compareTo(Appointment o) {
		
		
		if(month_num==o.month_num) {
			
			if(day == o.day) {
				
			if(time_num == o.time_num) {
				
				return 0;
				
			}
			
			else if(time_num < o.time_num) {
				
				return -1;

			}
			else {
				
				return 1;
			}

		}

			else if(day < o.day) {
				
				return -1;
			}
			
			else {
				
				return 1;
			}

		}
		
		else if(month_num < o.month_num) {
			
			return -1;
		}
		
		else {
			
			return 1;
		}


	} 
	
}


public static int month_to_int(String month) {
	

	int month_int = -1;
	
	if(month.equals("jan")) {
		month_int = 0;
	}
	
	else if(month.equals("feb")) {
		month_int = 1;
		}
	
	else if(month.equals("mar")) {
		month_int = 2;
		}
	
	else if(month.equals("apr")) {
		month_int = 3;
		}
	
	else if(month.equals("maj")) {
		month_int = 4;
		}
	
	else if(month.equals("jun")) {
		month_int = 5;
		}
	
	else if(month.equals("jul")) {
		month_int = 6;
		}
	
	else if(month.equals("aug")) {
		month_int = 7;
		}
	
	else if(month.equals("sep")) {
		month_int = 8;
		}
	
	else if(month.equals("okt")) {
		month_int = 9;
		}
	
	else if(month.equals("nov")) {
		month_int = 10;
		}
	
	else if(month.equals("dec")) {
		month_int = 11;
	}

	return month_int;
	
}

public static void main(String[] args) {
	

		Scanner s;
		s = new Scanner(System.in); // Declaring scanner
		
		String n_str = s.nextLine();
		int n = Integer.parseInt(n_str);


		ArrayList<Appointment> event = new ArrayList<Appointment>();

		for(int i=1; i<=n; i++){

            String[] data = s.nextLine().split("\\s+");

            String month = data[0];
            
            // To compare months, give them numbers.
            int month_num = month_to_int(month);
            
            int day = Integer.valueOf(data[1]);
            
            String time = data[2];
            // To compare time, remove the ":".
            
            int time_num = Integer.parseInt(time.replace(":",""));
            
            // Since note can be longer than just one input, add all together
            // with spaces inbetween.
            
            String note = data[3];
            
            for(int k =4; k<data.length;k++) {
            	
            	note += ' ' + data[k];
            }

            
            //System.out.println(note);
            //Appointment newappointment = new Appointment(month, day, time, note, month_num, time_num);
    		
    		event.add(new Appointment(month, month_num, day, time, time_num, note));

        }
		//System.out.println("\n\n" + event.get(2).time_num);
		
		
		// Organize the evens in the utility class Appointment. 
		// Only prints the relevant
		
		Collections.sort(event);
		for(Appointment o:event) {
			
			System.out.println(o.month + " " + o.day + " " + o.time + " "+ o.note);
			
			
			
			
		}
		
       
}


}
