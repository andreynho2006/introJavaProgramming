/**
 * File: AverageAcceleration.java
 * 
 *  Program that request the 2 velocity and a time and
 *  to display the average acceleration
 *  
 */
import java.util.Scanner;

public class AverageAcceleration {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		System.out.println("enter v0, v1 and t: ");
		
		double velocity0 = input.nextDouble();
		double velocity1 = input.nextDouble();
		double timeSpan = input.nextDouble();
		
		double averageAcceleration = (velocity1 - velocity0)/ timeSpan;
		
		
		System.out.println("The average acceleration is: " + averageAcceleration);
		
	}

}
