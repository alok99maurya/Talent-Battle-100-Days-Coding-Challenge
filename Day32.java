import java.util.Scanner;

// Question : Day 32 coding Statement : Write a Program to Remove vowels from a string
// input : remove 
//Output:rmv 
public class Day32 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter a String :");
		String input = scn.nextLine();
		String ans = "";
//		for(int i=0;i<input.length();i++) {
//			char ch = input.charAt(i);
//			if(ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U'||ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u') {
//				ans =ans+"";
//					
//			}
//			else {
//				ans= ans+ch;
//			}
//		}
		// second method use replace all function 
		ans = input.replaceAll("[aeiou]", "");
		System.out.println(ans);
	

	}

}
