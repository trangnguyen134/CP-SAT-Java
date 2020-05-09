package A1JavaBasic;

public class Exercise7 {

	public static void main(String[] args) {
		// TODO Relational Operators
		int Ten = 10;
		int Twenty = 20;
		int Thirty = 30;

		System.out.println("<<<<<< GREATER THAN OPERATOR >>>>>>");
		System.out.println(" Ten > Twenty ===> " + (Ten > Twenty));
		System.out.println(" Twenty > Ten ===> " + (Twenty > Ten));
		System.out.println(" Thirty > Twenty ===> " + (Thirty > Twenty));

		System.out.println("<<<<<< GREATER THAN OR EQUAL TO OPERATOR >>>>>>");
		System.out.println("Ten >= Twenty ===>" + (Ten >= Twenty));
		System.out.println("Twenty >= Ten ===> " + (Twenty >= Ten));
		System.out.println("Thirty >= Twenty ===> " + (Thirty >= Twenty));

		System.out.println("<<<<<< LESS THAN OPERATOR >>>>>>");
		System.out.println(" Ten < Twenty ==> " + (Ten < Twenty)); // true
		System.out.println(" Twenty < Ten ==> " + (Twenty < Ten)); // false
		System.out.println(" Thirty < Twenty ==> " + (Thirty < Twenty)); // false

		// less than or equal to
		System.out.println("<<<<<< LESS THAN OR EQUAL TO OPERATOR >>>>>>");
		System.out.println(" Ten <= Twenty ==> " + (Ten <= Twenty)); // true
		System.out.println(" Twenty <= Ten ==> " + (Twenty <= Ten)); // false
		System.out.println(" Thirty <= Twenty ==> " + (Thirty <= Twenty)); // false

		// equal to
		System.out.println("<<<<<< EQUAL TO OPERATOR >>>>>>");
		System.out.println(" Ten == Twenty ==> " + (Ten == Twenty)); // false
		System.out.println(" Thirty == Twenty + Ten ==> " + (Thirty == Twenty + Ten)); // true

		// not equal to
		System.out.println("<<<<<< NOT EQUAL TO OPERATOR >>>>>>");
		System.out.println(" Ten != Twenty ==> " + (Ten != Twenty)); // true
		System.out.println(" Thirty != Twenty + Ten ==> " + (Thirty != Twenty + Ten)); // false
	}

}
