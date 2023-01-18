import java.util.Scanner;

public class Day15 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter a Number");
		
		int n = scn.nextInt();
		int s = n;
		int sum=0;
		while(n!=0){
		    int n1 = n % 10;
		    int prod =1;
		    for(int i=1;i<=n1;i++){
		        prod = prod * i;
		        
		    }
		    sum = sum+prod;
		    n = n / 10;
		    
		}
		if(sum==s){
		    System.out.println("Strong Number");
		}
		else {
		    System.out.println("Not a Strong number");
		}

	}

}
