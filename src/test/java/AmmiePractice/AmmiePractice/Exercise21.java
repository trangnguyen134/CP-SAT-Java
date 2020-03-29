package AmmiePractice.AmmiePractice;

public class Exercise21 {

	public static void main(String[] args) {
		// Enhanced for loop in Java
		String days[] = { "Mon", "Tue", "Wed", "Thr", "Fri", "Sat", "Sun" };
		String dropdown[] = { "Ammie", "Mabu" };

		// Enhanced for loop, this will automatically iterate on the array list
		for (String dayName : days) {
			System.out.println("Days ==> " + dayName);
		}
		System.out.println("==== Print awesome name ====");
		for (String name : dropdown) {
			System.out.println("Name ===> " + name);

		}

		System.out.println("<==== Normal For Loop ====>");
		// Normal for loop
		for (int i = 0; i < days.length; i++) {
			System.out.println("Days ==> " + days[i]);
		}

		System.out.println("==== Print awesome name twice time ====");
		for (int n = 0; n < dropdown.length; n++) {
			System.out.println("Name ===> " + dropdown[n]);

		}

	}

}
