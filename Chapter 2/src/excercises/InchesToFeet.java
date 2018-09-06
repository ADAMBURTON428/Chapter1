package excercises;

public class InchesToFeet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int INCHES_IN_FOOT = 12;
		int feet;
		int inchesneeded = 86;
		int inchesremaining;

		
		feet = inchesneeded / INCHES_IN_FOOT ;
		inchesremaining = inchesneeded % INCHES_IN_FOOT;
		
		
		System.out.println("86 inches becomes " + feet + " feet and " + inchesremaining + " inches.");
	}

}
