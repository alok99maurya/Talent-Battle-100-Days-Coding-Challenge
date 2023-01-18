import java.util.Scanner;

public class Day5 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter a Number ");
		int n = scn.nextInt();
		if(n%2==0) {
			System.out.println("Even number");
		}
		else {
			System.out.println("Odd number ");
		}

	}

}
