import java.util.Scanner;

public class PrimeSum {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter a Number");
		int n = scn.nextInt();
		System.out.println("Starting number");
		int st =scn.nextInt();
		System.out.println("Ending Number");
		int end = scn.nextInt();
		int ans = ans1(st,end);
		System.out.println(ans);
		
	}
	public static int ans1(int n1,int n2) {
		int last ;
		int sum =0;
		for(int i=n1;i<=n2;i++) {
			if(isPrime(i)) {
				last = i % 10;
				if(last==7) {
					sum = sum + i;
				}
			}
		}
		return sum;
	}
	public static boolean isPrime(int n) {
		if(n<=1) {
			return false;
		}
		for(int i=2;i<n;i++) {
			if(n % i==0) {
				return false;
			}
		}
		return true;
	}

}
