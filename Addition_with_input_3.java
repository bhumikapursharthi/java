
import java.util.Scanner;
public class Addition_with_input_3 {

	public static void main(String[] args) {
		Scanner addn = new Scanner(System.in);
		//scanner is a class and addn is object created of that class, system.in takes input
		
		System.out.println("Enter the first number");
		int a= addn.nextInt();
		
		System.out.println("Enter the second number");
		int b= addn.nextInt();
		
		int sum= a+b;
		
		System.out.println("Sum=" +sum);
		

	}

}
