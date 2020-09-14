package πÈ¡ÿ;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class no_3060_µ≈¡ˆ {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer token = new StringTokenizer(bf.readLine());
		int N = Integer.parseInt((token.nextToken()));
		int pig1 = 0, pig2 = 0, pig3 = 0, pig4 = 0, pig5 = 0, pig6 = 0;
		int cpig1 = 0, cpig2 = 0;
		int limit = 0;
		for (int i = 0; i < N; i++) {
			token = new StringTokenizer(bf.readLine());
			limit = Integer.parseInt((token.nextToken()));
			token = new StringTokenizer(bf.readLine());
			pig1 = Integer.parseInt((token.nextToken()));
			pig2 = Integer.parseInt((token.nextToken()));
			pig3 = Integer.parseInt((token.nextToken()));
			pig4 = Integer.parseInt((token.nextToken()));
			pig5 = Integer.parseInt((token.nextToken()));
			pig6 = Integer.parseInt((token.nextToken()));

			int day = 1;
			if (pig1 + pig2 + pig3 + pig4 + pig5 + pig6 > limit) {
				System.out.println(day);
				return;
			}
			day++;
			cpig1 = pig2 + pig6 + pig4; // pig6*3
			cpig2 = pig1 + pig3 + pig5; // pig3*3
			while (cpig1*3 + cpig2*3 <= limit) {
				day++;
				int temp=cpig1;
				cpig1 = cpig2*3;
				cpig2 = temp*3;
			}

			System.out.println(day);
		}
	}

}
