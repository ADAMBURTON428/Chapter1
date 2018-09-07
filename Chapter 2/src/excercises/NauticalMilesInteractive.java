package excercises;

import java.util.Scanner;

public class NauticalMilesInteractive {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double kilometer = 1.852;
		double kilometer2;
		double miles = 1.150779;
		double miles2;
		double nauticalMiles = 60;
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter a Nautical Mile: ");
		nauticalMiles = input.nextInt();
		
		kilometer2 =  kilometer * nauticalMiles;
		miles2 =  miles * nauticalMiles;
		
		System.out.println("Kilometer: " + kilometer2);
		System.out.println("Miles: " + miles2);
		
	}

}
