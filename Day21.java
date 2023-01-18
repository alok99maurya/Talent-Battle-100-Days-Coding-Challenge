import java.util.Scanner;

public class Day21 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter a number");
		int num = scn.nextInt();
		int ans = num;
		int reverse = 0;
		while(num!=0) {
			int last = num % 10;
			reverse = reverse * 10 + last;
			num = num / 10;
		}
		if(reverse==ans) {
			System.out.println("Palindrome");
		}
		else {
			System.out.println("Not a Palindrome:");
		}
		

	}
	

}
