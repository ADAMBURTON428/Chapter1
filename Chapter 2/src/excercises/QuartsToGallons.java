package excercises;

public class QuartsToGallons {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	    int QTS_IN_GALLONS = 4;
		int numberofQuartsNeeded = 18;
		int numberofGallons;
		int numberofQuartsRemaining;
		
		
		
		numberofGallons = numberofQuartsNeeded / QTS_IN_GALLONS;
		numberofQuartsRemaining = numberofQuartsNeeded % QTS_IN_GALLONS;
		
		System.out.println("A job needs 18 quarts requires " + numberofGallons + " Gallons plus " + numberofQuartsRemaining + " quarts.");
		
		
	}

}
