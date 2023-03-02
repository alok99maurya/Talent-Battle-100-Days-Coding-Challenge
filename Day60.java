import java.util.Scanner;

public class Day60 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter a Number of test case");
		int t = scn.nextInt();
		int k;
		for(int i=0;i<t;i++) {
			
			int sum0=0;
			int sum1=0;
			for(int j=0;j<7;j++) {
				k=scn.nextInt();
				if(k==1) {
					sum1++;
				}
				else {
					sum0++;
				}
			}
		
		if(sum1 >sum0) {
			System.out.println("YES");
		}
		else {
			System.out.println("No");
		}
		}
		
		

	}

}
