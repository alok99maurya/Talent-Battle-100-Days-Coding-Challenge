import java.util.Arrays;

public class O8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n =17;
		for(int i=1;i<n;i++) {
			sum1(i);
		}

	}
	public static int sum1(int n) {
		boolean pr[] = new boolean[n +1];
		Arrays.fill(pr, true);
		for(int p=2;p*p<=n;p++) {
			if(pr[p]==true) {
				for(int i=p*2;i<=n;i+=p) {
					pr[i] = false;
				}
			}
			int sum =0;
			for(int i=2;i<=n;i++) {
				if(pr[i]) {
		
				int last = i%10;
				if(last==7) {
					sum = sum + i;
				}
			}
				return sum;
				
			
		}
			
			
		
	}
		return -1;
	}
}

	
