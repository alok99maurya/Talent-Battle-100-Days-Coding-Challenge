import java.util.Scanner;

public class Day20 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter a Number :");
		int num = scn.nextInt();
		int count = 0;
		if(num==1) {
			System.out.println(num + " is not  a prime ");
			return;
		}
		
		for(int i=2;i<num;i++) {
			if(num % i==0) {
				count++;
				break;
			}
		}
		if(count==0) {
			System.out.println(num + " is a  prime ");
		}
		
		else {
			System.out.println(num + " is not  a prime ");
		}

	}

}
