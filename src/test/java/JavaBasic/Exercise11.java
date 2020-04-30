package JavaBasic;

public class Exercise11 {

	public static void main(String[] args) {
		// TODO The if then else if Statement
		String sDay = "Saturday";
		int iDay = 3;

		if (sDay.equals("Sunday")) {
			System.out.println("Today is Sunday");

		} else if (sDay.equals("Saturday")) {
			System.out.println("Today is Saturday");

		} else {
			System.out.println("Today is a weekday");

		}
		if (iDay == 7) {
			System.out.println("Today is Sunday");

		} else if (iDay == 6) {
			System.out.println("Today is Saturday");

		} else {
			System.out.println("Today is a weekday");

		}
	}

}
