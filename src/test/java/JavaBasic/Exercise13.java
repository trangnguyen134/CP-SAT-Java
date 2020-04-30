package JavaBasic;

public class Exercise13 {

	public static void main(String[] args) {
		// TODO Arrays
		String[] aMake = { "BMW", "AUDI", "RANGE ROVER", "TOYOTA", "SUZUKI", "HONDA" };

		int iLength = aMake.length;
		System.out.println("Length of the array is: " + iLength);

		String sBMW = aMake[0];
		System.out.println("The first value of array is: " + sBMW);

		String sHonda = aMake[iLength - 1];
		System.out.println("The last value of array is: " + sHonda);

		for (int i = 0; i <= iLength - 1; i++) {
			System.out.println("The value stored at position " + i + " in aMake array is: " + aMake[i]);
		}

	}

}
