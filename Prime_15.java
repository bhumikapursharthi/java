import java.util.Scanner;

public class Prime_15 {

	public static void main(String[] args) {
		Scanner pr = new Scanner(System.in);
		System.out.println("Enter the number:");
		int n = pr.nextInt();
		
		int count=0;
		for(int i=1;i<=n;i++) {
			if(n%i == 0) {
				count++;
			}
			}
		
		
		if(count==2) {
			System.out.println("The number is prime");
		}
		else {
			System.out.println("The number is not prime");
		}
		

	}

}
