package A1JavaBasic;

public class Exercise18 {

	public static void main(String[] args) {
		//The continue Keyword
		// This will print -- 0,1,2,4,5
		for (int Count = 0; Count <= 9; Count++) {
			if (Count == 9) {
				System.out.println("Count is ==> " + Count);
				continue;
			}
			//System.out.println("Count is ==> " + Count);
		}

		// This will just print -- 3
		System.out.println("<==== Next Count ====>");
		for (int Count = 0; Count <= 6; Count++) {
			if (Count == 9) {
		//		System.out.println("Count is ==> " + Count);
				continue;
			}
			System.out.println("Count is ==> " + Count);
		}

	}

}
