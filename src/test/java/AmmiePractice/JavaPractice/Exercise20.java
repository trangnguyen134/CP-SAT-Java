package AmmiePractice.JavaPractice;

public class Exercise20 {

	public static void main(String[] args) {
		// The do-while Loop
		int Count = 0;
		// This will print -- 5,10,15,20,25
		do {
			Count = Count + 5;
			System.out.println("Count is ==> " + Count);
		} while (Count < 25);

		int CountOnce = 25;
		System.out.println("<==== Next Count ====>");
		// This will just print once
		do {
			CountOnce = CountOnce + 5;
			System.out.println("Count is ==> " + CountOnce);
		} while (CountOnce < 20);

	}

}
