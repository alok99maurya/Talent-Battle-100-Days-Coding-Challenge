import java.util.Scanner;

public class Day45 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter a Size of First Array");
		int n1 = scn.nextInt();
		int[] arr1 = new int[n1];
		for(int i=0;i<arr1.length;i++) {
			arr1[i] = scn.nextInt();
		}
		int max = arr1[0];
		int min = arr1[0];
		for(int i=0;i<arr1.length;i++) {
			if(min>arr1[i]) {
				min = arr1[i];
			}
			if(max<arr1[i]) {
				max = arr1[i];
			}
		}
		System.out.println("Largest Number:"+ max);
		System.out.println("Smallest Number :"+ min);
		
		

	}

}
