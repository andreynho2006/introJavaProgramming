package selections;
import java.util.Scanner;

public class OrderTwoCities {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter the first city: ");
		String city1 = input.nextLine();
		System.out.println("Enter second city:");
		String city2 = input.nextLine();
		
		if(city1.compareTo(city2) < 0) {
			System.out.println("Cities in alphabetical order are: " + city1 + ", " + city2);
		} else {
			System.out.println("Cities in alphabetical order are: " + city2 + ", " + city1);
		}
		
		
		input.close();
	}

}
