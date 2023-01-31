import java.util.Scanner;

public class Day43 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter a Size of First Array");
		int n1 = scn.nextInt();
		int[] arr1 = new int[n1];
		for(int i=0;i<arr1.length;i++) {
			arr1[i] = scn.nextInt();
		}
		int o=0;
		int e=0;
		for(int i=0;i<arr1.length;i++) {
			if(arr1[i]%2==0) {
				e++;
				
			}
			else {
				o++;
			}
			
		}
		if(o==arr1.length) {
			System.out.println("ODD");
		}
		else if(e==arr1.length) {
			System.out.println("EVEN");
		}
		else {
			System.out.println("mixed");
		}

	}

}
