package excercises;

import java.util.Scanner;

public class Initials {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		String First;
		String Middle;
		String Last;
		
		System.out.print("enter your first initial: ");
		First = input.next();
		
		System.out.print("enter your Middle initial: ");
		Middle = input.next();
		
		System.out.print("enter your Last initial: ");
		Last = input.next();
		
		System.out.println(First + "." + Middle + "." + Last + ".");
		
	}

}
