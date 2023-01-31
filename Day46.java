import java.util.Scanner;
// Sum of Arrays Element 
public class Day46 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter a Size of First Array");
		int n1 = scn.nextInt();
		int[] arr1 = new int[n1];
		for(int i=0;i<arr1.length;i++) {
			arr1[i] = scn.nextInt();
		}
		int sum =0;
		for(int i=0;i<arr1.length;i++) {
			sum = sum + arr1[i];
		}
		System.out.println(sum);

	}

}
