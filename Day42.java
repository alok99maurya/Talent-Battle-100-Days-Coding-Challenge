
import java.util.Arrays;
import java.util.Scanner;

//Write Program to check if two arrays are the same or not
public class Day42 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter a Size of First Array");
		int n1 = scn.nextInt();
		int[] arr1 = new int[n1];
		for(int i=0;i<arr1.length;i++) {
			arr1[i] = scn.nextInt();
		}
		//System.out.println(Arrays.toString(arr1));
		System.out.println("Enter a Size of Second Array");
		int n2 = scn.nextInt();
		int[] arr2 = new int[n1];
		for(int i=0;i<arr2.length;i++) {
			arr2[i] = scn.nextInt();
		}
		boolean result = Arrays.equals(arr1, arr2);
		if(result==true) {
			System.out.println("Same");
		}
		else {
			System.out.println("Not Equal ");
		}
		

	}

}
