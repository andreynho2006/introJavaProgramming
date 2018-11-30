import java.util.Scanner;

public class ComputeChange {

	public static void main(String[] args) {
		//Prompt user to enter amounth as a decimal number 15.24
		System.out.println("Enter the amounth of money to change: ");
		Scanner input = new Scanner(System.in);
		
		double amounth = input.nextDouble();
		
		int remainingAmounth = (int)(amounth * 100);
		
		int numberOfDollars = remainingAmounth / 100;
		remainingAmounth = remainingAmounth % 100;
		
		int numberOfQuarters = remainingAmounth / 25;
		remainingAmounth = remainingAmounth % 25;
		
		int numberOfDimes = remainingAmounth / 10;
		remainingAmounth = remainingAmounth % 10;
		
		int numberOfNickels = remainingAmounth / 5;
		remainingAmounth = remainingAmounth % 5;
		
		int numberOfPennies = remainingAmounth;
		
		System.out.println("Your amounth " + amounth + " consist of: ");
		System.out.println(" " + numberOfDollars + " dollars ");
		System.out.println(" " + numberOfQuarters + " quarters ");
		System.out.println(" " + numberOfDimes + " dimes ");
		System.out.println(" " + numberOfNickels + " nickels ");
		System.out.println(" " + numberOfPennies + " pennies ");

	}
}
