import java.util.Scanner;

public class Day17 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter a number:");
		int num = scn.nextInt();
		for(int i=1;i<=num;i++) {
			if(num % i==0) {
				System.out.print(i + ", ");
			}
		}

	}

}
