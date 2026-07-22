import java.util.Scanner;
public class Palindrome_16 {

	public static void main(String[] args) {
		Scanner pl = new Scanner(System.in);
		System.out.println("Enter the number");
		int n = pl.nextInt();
		int  rev = 0 ;
	
		int og = n;
		while( n != 0) {
		int dig  = n%10;
		rev = rev *10 + dig ;
		n = n / 10;
		
		
		

	}
		if(og == rev) {
			System.out.println("The number is Palindrome");
			}
		else {
			System.out.println("The number is not a Palindrome");
		}
			

}}


