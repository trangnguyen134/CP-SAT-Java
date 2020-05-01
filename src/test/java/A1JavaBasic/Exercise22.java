package A1JavaBasic;

public class Exercise22 {
	private String sModel;
	private int iMake;
	private int iGear;
	int iHighestSpeed;
	String sColor;
	boolean bLeftHandDrive;
	String sTransmission;
	int iTyres;
	int iDoors;

	// Default values set in Constructor
	public Exercise22() {
		sModel = "Camry";
		iMake = 2014;
		iGear = 5;
	}

	public void DisplayCharacterstics() {
		System.out.println("Model of the Car: " + sModel);
		System.out.println("Number of gears in the Car: " + iGear);
		System.out.println("Max speed of the Car: " + iHighestSpeed);
		System.out.println("Color of the Car: " + sColor);
		System.out.println("Make of the Car: " + iMake);
		System.out.println("Transmission of the Car: " + sTransmission);

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Exercise22 Toyota = new Exercise22();

		Toyota.iDoors = 4;
		Toyota.iHighestSpeed = 200;
		Toyota.iTyres = 4;
		Toyota.sColor = "Black";
		Toyota.sTransmission = "Manual";
		Toyota.bLeftHandDrive = true;

		// Using Car class method
		Toyota.DisplayCharacterstics();
		
		Exercise22 Audi = new Exercise22();
		Audi.sModel = "Audi Q7";
		Audi.bLeftHandDrive = true;
		Audi.iDoors = 4;
		Audi.iHighestSpeed = 500;
		Audi.sColor = "Moonlight";
		Audi.iTyres = 4;
		Audi.sTransmission = "Automatic";
		
		System.out.println(" ===== Printing  Audi ===== ");
		Audi.DisplayCharacterstics();
		

	}

}
