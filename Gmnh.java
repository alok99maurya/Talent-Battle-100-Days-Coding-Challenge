import java.util.Scanner;
import java.util.Arrays;

public class Gmnh {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter a string");
		String str  = scn.nextLine();
		sortString(str);
		
		
		

	}
	public  static void sortString(String str) {
	        char []arr = str.toCharArray();
	        Arrays.sort(arr);
	        System.out.print(String.valueOf(arr));
	    }

}
