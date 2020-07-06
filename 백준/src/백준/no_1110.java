package น้มุ;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class no_1110 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
		int firstNum = Integer.parseInt(read.readLine());
		int newNum = firstNum;
		for (int i = 1;; i++) {
			newNum = (newNum % 10) * 10 + (newNum / 10 + newNum % 10) % 10;
			if(newNum==firstNum) {
				System.out.println(i);
				return;
			}
		}
	}

}
