//check eligibily of someone to donate blood(parameters: weight and age)
import java.util.Scanner;
public class Nested_if_11 {

	public static void main(String[] args) {
		Scanner nest = new Scanner(System.in);
		
		System.out.println("Enter age:");
		int a = nest.nextInt();
		
		System.out.println("Enter Weight:");
		int w = nest.nextInt();
		
		if(a>18) {
			if(w>55) {
				System.out.println("You are eligible to donate blood");
				
			}
			else {
				System.out.println("You are underweight");
			}
			
		}
		else {
			System.out.println("NOT ELIGIBLE");
		}
		

	}

}
