import java.util.Scanner;

public class compoundValue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		System.out.println("Entry the mountly saving amounth: ");
		double amounthSaving = input.nextDouble();
		double rate = (1 + 0.00417);
		double amounth = 0;
		double sum = 0;
		for(int i = 0; i < 6; i++) {
			amounth = (sum + amounthSaving)  * rate;
			sum = amounth;
		}
		
		
		
		System.out.println("After six mounth's the account value is: " + sum);
		
	}

}
