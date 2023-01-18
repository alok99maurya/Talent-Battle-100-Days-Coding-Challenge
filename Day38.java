import java.util.Scanner;

public class Day38 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter a String:");
		String str =scn.nextLine();
		String str1 ="";
		for(int i=0;i<str.length()-1;i++) {
			for(int j=i+1;j<str.length();j++) {
				if(str.charAt(i)!=str.charAt(j)) {
					str1 =str1 + str.charAt(i);
				}
				
			}
			
		}
		System.out.println(str1);

	}

}
