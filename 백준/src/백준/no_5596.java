package น้มุ;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class no_5596 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer token = new StringTokenizer(read.readLine());
		int first_sum=0, second_sum = 0;

		for (int i = 0; i < 4; i++) {
			first_sum+=Integer.parseInt(token.nextToken());
		}
		token=new StringTokenizer(read.readLine());
		
		for(int i=0 ; i< 4 ; i++) {
			second_sum+=Integer.parseInt(token.nextToken());
		}
		System.out.println(first_sum>second_sum?first_sum:second_sum);
	}

}
