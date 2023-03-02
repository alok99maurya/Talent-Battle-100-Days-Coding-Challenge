import java.util.Scanner;

public class Day61 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter The Test Case:");
		int t = scn.nextInt();
		int n1;
		int n2;
		int sum =0;
		for(int i=0;i<t;i++) {
			n1=scn.nextInt();
			n2=scn.nextInt();
			sum = n1+n2;
			if(sum<3) {
				System.out.println("1");
			}
			else if(sum>=3 && sum<=10) {
				System.out.println("2");
				
			}
			else if(sum>=11 && sum<=60) {
				System.out.println("3");
			}
			else {
				System.out.println("4");
			}
			
		}

	}

}
