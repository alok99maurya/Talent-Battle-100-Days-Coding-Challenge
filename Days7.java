import java.util.Scanner;

public class Days7 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter a months");
		int m = scn.nextInt();
		System.out.println("Enter a year");
		int year = scn.nextInt();
		if(m==1 ||m==3||m==5||m==7||m==8||m==10||m==12) {
			System.out.println("31");
			
		}
		else if(m==4||m==6||m==9||m==11) {
			System.out.println("30");
		}
		else if ((year % 4 == 0 && year % 100 != 0) && (year >= 1 && year <= 9999)|| year % 400 == 0 && (year >= 1 && year <= 9999)) {
			System.out.println("29");
		}
		else {
			System.out.println("28");
		}
		

	}

}
