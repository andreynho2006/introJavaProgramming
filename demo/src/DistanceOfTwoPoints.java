import java.util.Scanner;

public class DistanceOfTwoPoints {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter x0 and y0: ");
		double x0 = input.nextDouble();
		double y0 = input.nextDouble();
		
		System.out.println("Enter x1 and y1: ");
		double x1 = input.nextDouble();
		double y1 = input.nextDouble();
		
		double expresie1 = Math.pow((x1 - x0), 2);
		
		double expresie2 = Math.pow((y1 - y0), 2);
		
		
		double distance = Math.pow((expresie1 + expresie2), 0.5);
		
		System.out.println("The distance between 2 points is: " + distance);
		
	}

}
