import java.util.Scanner;


public class SumTheDigits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter a number between 0 and 1000: ");
		Scanner input = new Scanner(System.in);
		
		int number = input.nextInt();
		int sum = 0;
		while(number > 0) {
			int num = number % 10;
			sum += num;
			number /= 10;
		}
		System.out.println("Sum is: " + sum);
	}

}
