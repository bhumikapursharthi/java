import java.util.Scanner;
public class Armstrong_17 {

	public static void main(String[] args) {
		Scanner arm = new Scanner(System.in);
		System.out.println("Enter the number:");
		int num = arm.nextInt();
		int og = num ;
		int sum = 0;
		while(num !=0) {
			int dig = num % 10;
			sum = sum + dig*dig*dig;
			num = num / 10;
			
		}
		if( sum ==og ) {
			System.out.println("The number is an Armstrong number");
		}
		else {
			System.out.println("The number is not an Armstrong number");
		}

	}

}
