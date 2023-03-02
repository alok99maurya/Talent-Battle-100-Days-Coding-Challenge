import java.util.Scanner;

public class Day64 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter a Test case: ");
		int t = scn.nextInt();
		while(t-->0) {
			String str = scn.next();
			if(str.contains("010")|| str.contains("101")) {
				System.out.println("Good");
			}
			else {
				System.out.println("Bad");
			}
		}

	}

}
