import java.util.Scanner;
public class Positive_negative_6 {

	public static void main(String[] args) {
		Scanner pon = new Scanner(System.in);
		System.out.println("Enter the number:");
		int a = pon.nextInt();
		
		if(a>0) {
			System.out.println("The number is postive");
		}
		else if (a<0) {
			System.out.println("The number is negative");
		}
		else {
			System.out.println("The number is Zero");
		}
			
	}

}
