package AmmiePractice.JavaPractice;

public class Car {
	String sModel;
	int iGear;
	int iHighestSpeed;
	String sColor;
	int iMake;
	boolean bLeftHandDrive;
	String sTransmission;
	int iTyres;
	int iDoors;
	
    public void DisplayCharacterstics(){
        System.out.println("Model of the Car: " +  sModel);
        System.out.println("Number of gears in the Car: " +  iGear);
        System.out.println("Max speed of the Car: " +  iHighestSpeed);
        System.out.println("Color of the Car: " +  sColor);
        System.out.println("Make of the Car: " +  iMake);
        System.out.println("Transmission of the Car: " +  sTransmission);
    
       }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car Toyota = new Car();
		Toyota.sModel = "Rav4";
		Toyota.iGear = 5;
		Toyota.iHighestSpeed = 200;
		Toyota.iMake = 4;
		Toyota.bLeftHandDrive = true;
		Toyota.sTransmission = "Automatic";
		Toyota.iTyres = 4;
		Toyota.iDoors = 4;
		Toyota.sColor = "White";
		
		//Print the car
		
		Toyota.DisplayCharacterstics();
	}

}
