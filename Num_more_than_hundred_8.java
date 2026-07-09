import java.util.Scanner;
public class Num_more_than_hundred_8 {

	public static void main(String[] args) {
		Scanner hun = new Scanner(System.in);
		System.out.println("Enter the number:");
		int a = hun.nextInt();
		
		if(a>100) {
			System.out.println("The number is greater than 100");
			
		}
		else {
			System.out.println("The number is less than hundred");
		}
	}

}
