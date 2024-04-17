
import java.util.Scanner;

public class Numbersystem {

	
	public static void
	numberGame()
	{
		
		Scanner sc = new Scanner(System.in);

		
		int number = 1 + (int)(100* Math.random());
		
		int trail = 3;

		int i, guess;

		System.out.println(
			"A number is chosen"
			+ " between 1 to 100."
			+ "You can guess the no in 3 trials");

		
		for (i = 0; i < trail; i++) {

			System.out.println(
				"Guess the number:");

			
			guess = sc.nextInt();

			
			if (number == guess) {
				System.out.println(
					"Congratulations!"
					+ " You guessed the number.");
				break;
			}
			else if (number > guess
					&& i != trail - 1) {
				System.out.println(
					"The number is "
					+ "too low " + guess);
			}
			else if (number < guess
					&& i != trail - 1) {
				System.out.println(
					"The number is"
					+ " too high " + guess);
			}
		}

		if (i == trail) {
			System.out.println(
				"You have exhausted"
				+ " the trials.");

			System.out.println(
				"The number was " + number);
		}
	}

	
	public static void main(String arg[])
	{
        numberGame();
	}
}
