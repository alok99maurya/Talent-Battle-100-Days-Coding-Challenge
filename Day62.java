
import java.util.Scanner;

public class Day62 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt(); // number of testcases

        for (int i = 0; i < T; i++) {
            int N = sc.nextInt();
            int X = sc.nextInt();
            int Y = sc.nextInt();

            int totalCapacity = (N + 1) * Y;
            if (totalCapacity >= X) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
       sc.close();
    }
}
