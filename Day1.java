import java.util.Scanner;
// Take an input character from the user and check whether the given input is a vowel or consonant.

//Input A OutputVowel




public class Day1 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		char c = scn.next().charAt(0);
		
		if(c =='A'|| c=='E'|| c =='I'|| c=='O'|| c=='U'|| c=='a'||c=='e'||c=='i'||c=='o'||c=='u') {
			System.out.println("Vowel");
			
		}
		else if((c>='a'&&c<='z')||(c>='A'&&c<='Z')) {
			System.out.println("Conso");
		}
		else {
			System.out.println("Invalid");
		}
		

	}

}
