import java.util.Scanner;


public class CelsiusToFahrenheit {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter a degree in Celsius: ");
		
		double celsiusValue = input.nextDouble();
		
		double fahrenheitValue = ( 9.0 / 5 ) * celsiusValue + 32;
		
		System.out.println( celsiusValue + " degree Celsius is " + fahrenheitValue + " degree in Fahrenheit.");
	}
}
