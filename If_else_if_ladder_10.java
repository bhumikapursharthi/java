import java.util.Scanner;
public class If_else_if_ladder_10 {

	public static void main(String[] args) {
		
		Scanner pnz = new Scanner(System.in);
		System.out.println("Enter the number:");
		int a = pnz.nextInt();
		
		if(a>0) {
			System.out.println("The number is Positive");
		}
		else if(a<0) {
			System.out.println("The number is Negative");
		}
		else
			System.out.println("The number is Zero");
	}

}


