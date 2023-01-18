import java.util.Scanner;

// Day 2 coding Statement: Write a program to identify if the character is an alphabet or not.
public class Days2 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter a Character");
		char c = scn.next().charAt(0);
		if ((c>='a'&& c<='z')||(c>='A'&& c<='Z')) {
			System.out.println("Alphabet");
		}
		else {
			System.out.println("Not a alphabet");
		}

	}

}
