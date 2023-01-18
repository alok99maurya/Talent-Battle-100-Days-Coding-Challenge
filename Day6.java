import java.util.Scanner;

public class Day6 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter a First Number:");
		int n1 = scn.nextInt();
		System.out.println("Enter a Second Number ");
		int n2 = scn.nextInt();
		if(n1>0 && n2>0) {
			System.out.println("This point lies in first quadrant.");
		}
		else if(n1<0&& n2>0) {
			System.out.println("This point lies in Second quadrant.");
		}
		else if(n1>0&&n2<0) {
			System.out.println("This point lies in Fourth quadrant.");
		}
		else {
			System.out.println("This point lies in Thirds quadrant.");
		}

	}

}
