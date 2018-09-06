package excercises;

import java.util.Scanner;

public class QuartsToGallonsInteractive {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		int QTS_IN_GALLONS = 4;
		int numberofQuartsNeeded;
		int numberofGallons;
		int numberofQuartsRemaining;
		Scanner input = new Scanner(System.in);
		
		System.out.print("enter Quarts Needed for the job");
		numberofQuartsNeeded = input.nextInt();
		
		numberofGallons = numberofQuartsNeeded / QTS_IN_GALLONS;
		numberofQuartsRemaining = numberofQuartsNeeded % QTS_IN_GALLONS;
		
		System.out.println("A job needs "+ numberofQuartsNeeded + " quarts requires " + numberofGallons + " Gallons plus " + numberofQuartsRemaining + " quarts.");
		
	}

}
