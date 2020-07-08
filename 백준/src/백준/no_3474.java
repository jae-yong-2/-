package น้มุ;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class no_3474 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		int num = Integer.parseInt(bf.readLine());
		
		for (int index = 0; index < num; index++) {
			int num1=Integer.parseInt(bf.readLine());
			int countFive = 0;
			for (int i = 1; i <= num1; i++) {
				int five = i;
				while (five % 5 == 0 && five != 0) {
					five = five / 5;
					countFive++;
				}
				
				if (i == num1) {
					System.out.println(countFive);
				}
			}
		}
	}

}
