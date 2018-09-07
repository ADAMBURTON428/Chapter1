package excercises;

import java.util.Scanner;

public class Eggs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double dozenCost = 3.25;
		int dozen = 12 ;
		int eggsNeeded;
		int numberofCarton;
		int eggRemainging;
		double eggCost = 0.45;
		double eggTotalCost;
		Scanner input = new Scanner(System.in);
		
		
		System.out.print("Enter the amount eggs you need");
		eggsNeeded = input.nextInt();
		
		if (eggsNeeded >= 12) {
			numberofCarton = eggsNeeded / dozen;
			eggRemainging = eggsNeeded % dozen;
			eggTotalCost = numberofCarton * dozenCost + eggRemainging * eggCost;
			System.out.print("That will be $ " + eggTotalCost + " for " + numberofCarton 
					+ " Carton and " + eggRemainging + " spare eggs.");
			
		}
		else {
			
			eggTotalCost = eggsNeeded * eggCost;
			
			System.out.print("That will be $ " + eggTotalCost + " for " + eggsNeeded + " eggs.");
			
			}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
