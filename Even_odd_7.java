import java.util.Scanner;
import java.util.scanner;
public class Even_odd_7 {

	public static void main(String[] args) {
	Scanner eoo = new Scanner(System.in);
	System.out.println("Enter the number:");
	int a = eoo.nextInt();
	
	if(a%2==0) {
		System.out.println("The number is even:");
	}
	else {
		System.out.println("The number is odd");
	}
	}

}
