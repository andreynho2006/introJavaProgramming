import java.util.Scanner;

public class PoundsToKilograms {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter a value in pounds: ");
		double pounds = input.nextDouble();
		
		double kilograms = pounds * 0.454;
		
		System.out.println(pounds + " pounds is " + kilograms + " kilograms.");
		
		input.close();
	}
}
