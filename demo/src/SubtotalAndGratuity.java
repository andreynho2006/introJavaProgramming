import java.util.Scanner;

public class SubtotalAndGratuity {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("Enter subtotal and  a gratuity rate: ");
		double subtotal = input.nextDouble();
		double gratuityRate = input.nextDouble();
		
		double gratuity = subtotal * (gratuityRate / 100);
		double total = subtotal + gratuity;
		
		System.out.println("the gratuity is " + gratuity + " and total sum is " + total);
		
		input.close();
	}

}
