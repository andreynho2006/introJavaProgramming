import java.util.Scanner;

public class FindNumberOfYears {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the number of minutes: ");
		long minutes = input.nextLong();
		
		int minutesInYear = 365 * 24 * 60;
		int minutesInDays = 24 * 60;
		int minutesInHours = 60;
		
		long years = minutes / minutesInYear;
		long reminder = minutes % minutesInYear;
		long days = reminder / minutesInDays;
		
		System.out.println(minutes +" minutes is aproximatly " + years + " years and " + days + " days.");
		
	}

}
