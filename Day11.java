import java.util.Scanner;

public class Day11 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter a Number :");
		int num = scn.nextInt();
		int n1 =0;
		int n2 = 1;
		System.out.print(n1+" " + n2);
		int n3=0;
		for(int i=2;i<num;i++) {
			n3 = n1 + n2;
			System.out.print(" "+n3);
			n1 = n2;
			n2=n3;
			
		}

	}

}
