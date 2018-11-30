
import java.util.Scanner;

public class ComputeArea {

	public static void main(String[] args) {
		//Create a Scanner object
		Scanner input = new Scanner(System.in);
		//Step 1: Read in Radius
		//Prompt the user to enter a radius
		System.out.print("Enter a number for radius: ");
		double radius = input.nextDouble();
		
		//Step 2: Compute area
		
		double area = radius * radius * 3.14159;
		
		//Step 3: Display the area
		System.out.println("The area of the circle with radius " + radius + " is " + area + " !");
	}
}
