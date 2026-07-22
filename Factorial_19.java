import java.util.Scanner;
public class Factorial_19 {

	public static void main(String[] args) {
		Scanner fc = new Scanner(System.in);
		System.out.println("Enter the number");
		int num = fc.nextInt();
		int fact = 1;
		for(int i=1; i<=5; i++) {
			fact = fact*i;
			
		}
		System.out.println("the factorial is "+fact);
		

	}

}
