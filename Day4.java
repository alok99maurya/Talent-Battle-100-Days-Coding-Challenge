import java.util.Scanner;

public class Day4 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		
		System.out.println("Enter a number:");
		int num = scn.nextInt();
		if(num>0) {
			System.out.println("Positive Number");
		}
		else if(num<0 && num !=0) {
			System.out.println("Negative Number ");
		}
		else {
			System.out.println("Neither positive nor negative");
		}

	}

}
