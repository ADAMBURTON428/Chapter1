package gameZone;

import java.util.Scanner;

public class MadLibs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String noun1;
		String noun2;
		String adjective1;
		String adjective2;
		String verb1;
		String verb2;
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter a noun ");
		noun1 = input.next();
		System.out.print("Enter a another noun ");
		noun2 = input.next();
		System.out.print("Enter a adjective ");
		adjective1 = input.next();
		System.out.print("Enter a another adjective ");
		adjective2 = input.next();
		System.out.print("Enter a verb ");
		verb1 = input.next();
		System.out.print("Enter a another verb ");
		verb2 = input.next();
		
		System.out.print("A " + noun1 + " is on top of a " + noun2 +  " it " + verb1 + " to reach the " + adjective1 
				+ " " + noun2 + " then did a " + verb2 + " " + adjective2 );
		
		
		
		
	}

}
