/**
 * File: BodyMassIndex.java
 * 
 *  Program that request the weight in pounds and height in inchees and
 *  to display the Body Mass Index
 *  
 */
import java.util.Scanner;

public class BodyMassIndex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("Enter weight in pounds: ");
		double weight = input.nextDouble();
		
		System.out.println("Enter height in inchees: ");
		double height = input.nextDouble();
		
		double weightInKilograms = weight * 0.45359237;
		
		double heightInMeters = height * 0.0254;
		
		double bmi = weightInKilograms / Math.pow( heightInMeters, 2 );
		
		System.out.println("BMI is: " + bmi );
	}

}
