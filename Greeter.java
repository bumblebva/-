import java.util.Scanner;

public class Greeter {

	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		
		double math1 = 86.0;
		double math2 = 4.0;
		double math3 = 7.0;
		double product;
		double sum = math1 + math2;
		int userInput;
		
		System.out.println("Beli");
		
		System.out.println("Please enter a number: ");
		userInput = in.nextInt();
		product = math2 * userInput;
		System.out.println("The sum is..." + sum);
		System.out.println("The number you entered is: " + userInput);
		System.out.println("The product of your number and " + math2 + " is: " + product);
		
	}

}
                                                      