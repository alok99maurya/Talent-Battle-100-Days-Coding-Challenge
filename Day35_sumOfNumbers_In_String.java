//Day 35 coding Statement : Write a Program to Count the sum of numbers in a string
//i/p:Hello56  o/p: 11
import java.util.Scanner;

import javax.swing.text.AttributeSet.CharacterAttribute;


public class Day35_sumOfNumbers_In_String {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter a String");
		String str = scn.nextLine();
		int sum =0 ;
		for(int i=0;i<str.length();i++) {
			if(Character.isDigit(str.charAt(i))) {
				sum = sum + Character.getNumericValue(str.charAt(i));
			}
		}
		System.out.println(sum);
		

	}

}
