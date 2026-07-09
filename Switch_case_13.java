import java.util.Scanner;

public class Switch_case_13 {

	public static void main(String[] args) {
		
		Scanner week = new Scanner(System.in);
		
		System.out.println("Enter the number for day of a week:");
		int a = week.nextInt();
		switch(a) {
		case 1:System.out.println("Monday");
		break;
		case 2:System.out.println("Tuesday");
		break;
		case 3:System.out.println("Wednesday");
		break;
		case 4:System.out.println("Thursday");
		break;
		case 5:System.out.println("Friday");
		break;
		case 6:System.out.println("Saturday");
		break;
		case 7:System.out.println("Sunday");
		break;
		
		}

	}

}
