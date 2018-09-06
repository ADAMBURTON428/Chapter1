package excercises;

import java.util.Scanner;

public class InchesToFeetInteractive {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int INCHES_IN_FOOT = 12;
		int feet;
		int inchesneeded;
		int inchesremaining;
		System.out.print("enter a number of inches: ");
		inchesneeded = input.nextInt();
		
		feet = inchesneeded / INCHES_IN_FOOT ;
		inchesremaining = inchesneeded % INCHES_IN_FOOT;
		
		
		System.out.println(inchesneeded + " inches becomes " + feet + 
				" feet and " + inchesremaining + " inches.");
	}

}
