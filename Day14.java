import java.util.Scanner;

public class Day14 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter a Number ");
		int n = scn.nextInt();
		int ans=0;
		while(n!=0) {
			int test = n % 10 ;
			ans = ans * 10  + test;
			n = n / 10;
		}
		System.out.println(ans);
		

	}

}
