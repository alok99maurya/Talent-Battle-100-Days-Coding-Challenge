//Day 34 coding Statement : Write a Program to Remove brackets from an algebraic expression
//input : 7x+(2*y)  o/p : 7x+2*y
import java.util.Scanner;

public class Day34_Remove_Brackets {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter a algebraic expression");
		String exp = scn.nextLine();
		String exp1 = exp.replaceAll("[(){}]", "");
		System.out.println(exp1);

	}

}
