
import java.util.Scanner;
public class Nested_if_two_12 {

	public static void main(String[] args) {
		Scanner grd = new Scanner(System.in);
		System.out.println("Enter your marks of subject 1:");
		int a = grd.nextInt();
		System.out.println("Enter your marks of subject 2:");
		int b = grd.nextInt();
		if(a>90) {
			if(b>90) {
				System.out.println("YOU GOT AN A GRADE");
			}
			else {
				System.out.println("You got less marks in subject 2, grade is B");
			}
		}
		else if (a>80) {		
			if(b>80) {
				System.out.println("YOU GOT A B GRADE");
				
			}
			else {
				System.out.println("You got less marks in subject 2, grade is B");
			}
		}
		else {
			System.out.println("YOU GOT A C GRADE");
		}

		
		

	}

}
