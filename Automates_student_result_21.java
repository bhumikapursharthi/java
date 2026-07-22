import java.util.Scanner;
public class Automates_student_result_21 {

	public static void main(String[] args) {
		Scanner auto = new Scanner(System.in);
		System.out.println("Enter marks of subject 1:");
		int s1 = auto.nextInt();
		System.out.println("Enter marks of subject 2:");
		int s2 = auto.nextInt();
		System.out.println("Enter marks of subject 3");
		int s3 = auto.nextInt();
		System.out.println("Enter marks of subject 4:");
		int s4 = auto.nextInt();
		System.out.println("Enter marks of subject 5:");
		int s5 = auto.nextInt();
		System.out.println("Enter marks of subject 6:");
		int s6 = auto.nextInt();
		int total = s1 + s2 + s3 + s4+ s5+ s6;
		System.out.println("The marks total is:"+total);
		int per =  total/ 6;
		System.out.println("TOTAL PERCENTAGE:"+per);
		
		
		
		if(per>90) {
			System.out.println("You got A grade");
			
		}
		else if (80<per) {
			System.out.println("You got B grade");
			
		}
		
		else if (70<per) {
			System.out.println("You got C grade");
			
		}
		else {
			System.out.println("You got D grade");
			
		}
	}

}
