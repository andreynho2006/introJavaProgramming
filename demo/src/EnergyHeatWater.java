import java.util.Scanner;

public class EnergyHeatWater {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter the amouth of water in kilograms: ");
		double water = input.nextDouble();
		
		System.out.println("Enter the initial temperature: ");
		double initialTemperature = input.nextDouble();
		
		System.out.println("Enter the final temperature: ");
		double finalTemperature = input.nextDouble();
		
		double energyNeeded = water * ( finalTemperature - initialTemperature ) * 4184 ;
		
		System.out.println("The energy needed is: " + energyNeeded );
		
	}

}
