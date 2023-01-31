import java.util.Arrays;
import java.util.Scanner;

public class Day48 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter a Size of First Array");
		int n1 = scn.nextInt();
		int[] arr1 = new int[n1];
		for(int i=0;i<arr1.length;i++) {
			arr1[i] = scn.nextInt();
		}
		
		for(int i=0;i<n1;i++){
			for(int j=i+1;j<n1;j++) {
				
			
			if(arr1[i]==arr1[j]) {
				arr1[i]=-1;
				
			}
			}
			
		}
		for(int j=0;j<n1;j++) {
			if(arr1[j]!=-1) {
				System.out.print(arr1[j]+" ");
			}
		}

	}

}
