import java.util.Scanner;

public class Recursion
{
	public static void main(String args[])
	{
		double sqrt1 = 36.0d;
		double e = 0.00001d;
		Scanner in = new Scanner(System.in);
// Used a do while loop to find  the square root of a number by entering a number that is greater than 0
		do {
			System.out.println ("Enter a number to find it's square root:");
			sqrt1 = in.nextDouble();

			if (sqrt1 <= 0)
			{
				System.out.println(" The number should be greater than 0.");
			}
		} while (sqrt1 <= 0);
// Inserted another  do while loop to enter any number for an error, but it must be less than 0
		do
		{
			System.out.println("Enter a number for error");
			e = in.nextDouble();
			if (e <=0)
			{
				System.out.println ("Enter Error should not be less than 0");
			}
		} while (e <= 0);

		double answer = Sqrt(sqrt1, (sqrt1/2.0d), e);
		System.out.println (" Final guess was " + answer + " which squared is " + (answer * answer));
	}
	//  The Recursion function
	public static double Sqrt(double X, double guess, double e)
	{
		double lastGuess = guess;
		double testError = Math.abs(X - (guess * guess));
		System.out.println (" Testing " + guess + " against " + X + " with erorr " + e + " and testError " + testError);
		// Recursive case
		if (testError >= e)
		{
			guess = Sqrt(X, (0.5 * (lastGuess + (X / lastGuess))), e);
		}
		//  The Base case returned
		return guess;
	}
}
