import java.util.Arrays;

public class Slotution1 {

	public static void main(String[] args) {
		
		int n = 15;
		int a=0;
		int b=1;
		System.out.print(a + ","+ b+",");
		int next;
		for(int i=2;i<n;i++) {
			next = a+b;
			a = b;
			b = next;
			System.out.print(next + ",");
		}
		
	}
	

}
