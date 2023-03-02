import java.util.Scanner;

public class Day63 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter a test case :");
		int t = scn.nextInt();
		while(t-->0) {
			int w1=scn.nextInt();
			int w2=scn.nextInt();
			int x1=scn.nextInt();
			int x2=scn.nextInt();
			int m=scn.nextInt();
			
			if(w2>=w1+(x1*m) && w2>=w1+(x2*m) ) {
				System.out.println("1");
			}
			else {
				System.out.println("0");
			}
		}

	}

}
