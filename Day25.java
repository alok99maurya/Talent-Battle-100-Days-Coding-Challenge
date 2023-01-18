import java.util.Scanner;

public class Day25 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter a Number:");
		int radius = scn.nextInt();

		double area = 3.14 * radius * radius;
		System.out.println("Area of circle  is " + area);
		

	}

}
