import java.util.Scanner;

public class AlokKumarMaurya_Day28 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter a String");
		String str = scn.nextLine();
		String str1 ="";
		for(int i=str.length()-1;i>=0;i--) {
			str1 =   str1+str.charAt(i);
			
		}
		System.out.println(str1);

	}

}
