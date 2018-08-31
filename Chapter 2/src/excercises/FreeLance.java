package excercises;

import java.util.Scanner;

public class FreeLance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String name;
		int num1;
		int num2;
		int total;
		Scanner inputDevice = new Scanner(System.in);
		
		System.out.print("What is your name:  ");
		name = inputDevice.next();
		
		System.out.print("Enter a number:  ");
		num1 = inputDevice.nextInt();
		
		System.out.print("Enter another number:  ");
		num2 = inputDevice.nextInt(); 
		total = num1 + num2;
		
		System.out.println("Your name is " + name);
		System.out.println("Your total is " + total);
		
	}

}
