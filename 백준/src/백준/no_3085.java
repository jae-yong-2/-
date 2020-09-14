package น้มุ;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class no_3085 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		int test = Integer.parseInt(bf.readLine());
		StringTokenizer token = null;

		for (int i = 0; i < test; i++) {
			token = new StringTokenizer(bf.readLine());
			int n = Integer.parseInt(token.nextToken());
			int m = Integer.parseInt(token.nextToken());
			int div = 2;
			int sum = 0;
			for (; div <= n; div++) {
				if (n % div == 0) {
					n = n / div;
					sum += div;
					div--;
				}
			}
			if (sum == m) {
				System.out.println("yes");
			} else {
				System.out.println("no");
			}
		}
	}
}
