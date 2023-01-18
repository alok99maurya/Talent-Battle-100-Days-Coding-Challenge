import java.util.Scanner;

public class Day9 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter a Number:");
		int num = scn.nextInt();
		int count =0;
		while(num!=0) {
			int n1 = num % 10;
			count++;
			num = num / 10;
		
		}
		System.out.println(count);

	}

}
