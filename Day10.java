import java.util.Scanner;

public class Day10 {

	public static void main(String[] args) {
	Scanner scn = new Scanner(System.in);
	System.out.println("Enter a Number :");
	int num = scn.nextInt();
	int ans = 1;
	for(int i=1;i<=num;i++) {
		ans = ans * i;
		
	}
	System.out.println("the factorial :"+ ans);

	}

}
