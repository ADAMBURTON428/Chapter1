package YouDolt;

import java.util.Scanner;

public class IntergerDemoInteractive {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int anInt = 12;
		byte aByte = 12;
		short aShort = 12;
		long aLong = 12;
		
		String name;
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Please enter an integer >> ");
		anInt = input.nextInt();
		
		System.out.print("Please enter an Byte >> ");
		aByte = input.nextByte();
		
		System.out.print("Please enter an short >> ");
		aShort = input.nextShort();
		
		System.out.print("Please enter an long >> ");
		aLong = input.nextLong();
		
		System.out.println("What is your name >> ");
		name = input.next();
		
		System.out.println("The int is " + anInt);
		System.out.println("The byte is " + aByte );
		System.out.println("The short is " + aShort );
		System.out.println("The long is " + aLong );
	
	}

}
