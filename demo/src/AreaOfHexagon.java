/**
 * File: AreaOfHexagon.java
 * 
 *  Program that request the side length of a hexagon and
 *  to display the area
 *  
 */

import java.util.Scanner;

public class AreaOfHexagon {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter the side length of a hexagon: ");
		double sideLength = input.nextDouble();
		
		double hexagonArea = ((3 * Math.pow(3, 0.5)) / 2) * Math.pow(sideLength, 2);
				
		System.out.println("The area of the hexagon is: " + hexagonArea);
	}

}
