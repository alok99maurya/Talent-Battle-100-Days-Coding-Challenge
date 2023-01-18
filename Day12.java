import java.util.Scanner;

public class Day12 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter a number ");
		int n = scn.nextInt();
		int sum = 0;
		while(n!=0) {
			int n1 = n % 10;
			sum = sum + n1;
			n = n / 10;
		}
		System.out.println(sum);

	}

}
