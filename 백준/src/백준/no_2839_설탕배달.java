package ����;

import java.util.Scanner;

public class no_2839_������� {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int max = N;
		int cnt = 0;
		while (N / 5 != 0) {
			N -= 5;
			cnt++;
		}
		if (N % 3 == 0) {
			while (N != 0) {
				N -= 3;
				cnt++;
			}
		} else {
			while (N % 3 != 0) {
				N += 5;
				cnt--;
				if (N > max) {
					System.out.println(-1);
					return;
				}
			}
			while (N != 0) {
				N -= 3;
				cnt++;
			}
		}
		System.out.println(cnt);
	}

}
