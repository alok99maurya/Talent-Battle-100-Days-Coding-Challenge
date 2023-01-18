import java.util.Scanner;

public class Day19 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter a number:");
		int n = scn.nextInt();
		int ans = n;
		int a = n;
		int count =0;
		while(n!=0) {
			n = n / 10;
			count++;
			
		}
		int sum =0;
		while(a!=0) {
			int last = a % 10;
			a = a/10;
			int prod = 1;
			for(int i=1;i<=count;i++) {
				prod = prod * last;
			}
			sum = sum + prod;
		}
		System.out.println(sum);
		
		if(sum ==ans) {
			System.out.println("ArmStrong");
			
		}
		else {
			System.out.println("Not ArmStrong");
		}
	}
	
}