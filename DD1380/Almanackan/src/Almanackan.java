import java.util.Scanner;
import java.lang.Math;
import java.util.Scanner;
import java.util.Arrays;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.regex.*;
import java.util.ArrayList;



public class Almanackan {


public static void main(String[] args) {


		Scanner s;
		s = new Scanner(System.in); // Declaring scanner

		ArrayList<String> lines = new ArrayList<String>();

		while(s.hasNextLine()){
            String line = s.nextLine();


            lines.add(line);

        }
        System.out.println(lines);
}



}
