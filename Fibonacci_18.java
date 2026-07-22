import java.util.Scanner;
public class Fibonacci_18 {

	public static void main(String[] args) {
		Scanner fib = new Scanner(System.in);
		System.out.println("Enter the number:");
		int n = fib.nextInt();
		int a=0, b=1, c;
		
		for( int i = 1; i<=n; i++) {
			System.out.println(a);
			
			c= a+b;
			 a=b;
			 b=c;
			 
			
			
		}
		

	}

}
