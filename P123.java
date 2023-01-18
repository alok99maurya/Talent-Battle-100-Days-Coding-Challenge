import java.util.Arrays;
import java.util.Scanner;

public class P123 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter a number");
		int num = scn.nextInt();
		if(prime(num)&& odd(num)&&suare(num)&&cube(num)) {
			System.out.println(num);
		}
		
				
		

	}
	public static boolean prime(int n) {
		int i=2;
		boolean f= false;
		boolean s = false;
		while(i<=n/2) {
			if(n%i==0) {
				f = true;
				break;
			}
			++i;
		}
		if(!f) {
			s= true;
		}
		return s ;
		
	}
	public static boolean odd(int n) {
		boolean s1 = false;
		if(n % 2!=0) {
			s1 = true;
		}
		return s1;
	}
	public static boolean suare(int n) {
		int s = n * n;
		boolean s1 = false;
		if(s==n) {
			s1 = true;
		}
		return s1;
	}
	public static boolean cube(int n) {
		int s = n * n*n;
		boolean s1 = false;
		if(s==n) {
			s1 = true;
		}
		return s1;
	}
	


}
