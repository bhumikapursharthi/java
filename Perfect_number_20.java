import java.util.Scanner;
public class Perfect_number_20 {

	public static void main(String[] args) {
		Scanner pn = new Scanner(System.in);
		System.out.println("Enter the number:");
		int n = pn.nextInt();
		int sum = 0;
		
		for( int i = 1; i<=n ; i++) {
			sum = sum+i;
			
		}
		
        if(sum==n) {
        	System.out.println("perfect");
        }
        else {
        	System.out.println("not perfect");
        }
	}

}
