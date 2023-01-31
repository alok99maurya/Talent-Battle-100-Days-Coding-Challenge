import java.util.Scanner;

public class Day44 {

	public static void main(String[] args) {
		
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter a Size of First Array");
		int n1 = scn.nextInt();
		int[] arr1 = new int[n1];
		for(int i=0;i<arr1.length;i++) {
			arr1[i] = scn.nextInt();
		}
		int ev=0;
		int od=0;
		for(int i=0;i<arr1.length;i++) {
			if(arr1[i]%2==0) {
				ev++;
			}
			else {
				od++;
			}
		}
		System.out.println("Number of even elements :"+ ev);
		System.out.println("Number of odd elements :"+od);

	}

}
