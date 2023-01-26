import java.util.Scanner;

//Day 33 coding Statement : Write a Program to check if String is a palindrome or not
//input: noon output :Palindrome
public class Day33_Palindrome_String {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter your String :");
		String str1 = scn.nextLine();
		String str = str1;
		String str2 ="";
		for(int i=0;i<str1.length();i++) {
			str2 = str1.charAt(i)+ str2;
		}
		if(str2.equalsIgnoreCase(str1)) {
			System.out.println("Palindrome");
		}
		else {
			System.out.println("Not A palindrome");
		}

	}

}
