/**
 * File: Computeaverage.java
 * 
 * Display average of 3 numbers
 */
import java.util.Scanner;

public class ComputeAverage {

	public static void main(String[] args) {
		//Create a Scanner object
		Scanner input = new Scanner(System.in);
		//Step 1: Read in 3 numbers
		//Prompt the user to enter a radius
		System.out.println("Enter 3 numbers: ");
		double number1 = input.nextDouble();
		double number2 = input.nextDouble();
		double number3 = input.nextDouble();
		
		//Step 2: Compute average
		
		double average = (number1 + number2 + number3) / 3;
		
		//Step 3: Display the area
		System.out.println("The average of the numbers is " + average + " !");
	}
}
