package น้มุ;

import java.io.IOException;
import java.util.Scanner;

public class no_10872 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		int num=sc.nextInt();
		int dp[]=new int[21];

		dp[0] = 0;
		dp[1] = 1;
		if (num > 1) {
			for (int i = 2; i < num + 1; i++) {
				dp[i] = dp[i - 1] + dp[i - 2];
			}
		}
		System.out.println(dp[num]);
	}
}

