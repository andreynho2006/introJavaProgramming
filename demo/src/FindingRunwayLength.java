import java.util.Scanner;


public class FindingRunwayLength {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("Enter speed and acceleration: ");
		double speed = input.nextDouble();
		double acceleration = input.nextDouble();
		
		double runway = (Math.pow(speed, 2)) / (2 * acceleration);
		
		System.out.println("The minimium length runway for this airplane is: " + runway);
	}

}
