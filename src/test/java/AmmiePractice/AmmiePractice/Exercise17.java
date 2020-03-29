package AmmiePractice.AmmiePractice;

public class Exercise17 {

	public static void main(String[] args) {
		// There can be situations when you like to jump out of the loop when you met with some specific conditions. 
		//This is achieved with the keyword break. The break keyword must be used inside any loop or a switch statement. 
		//The break keyword will stop the execution of the innermost loop and start executing the next line of code after the for loop block.
		
		// Example: This will print -- 0,1,2,3,4,5
		for (int Count = 0; Count <= 10; Count++) {
			if (Count == 6) {
				break;
			}
			System.out.println("Count is ==> " + Count);
		}
		System.out.println("You have exited the loop");
	}

}
