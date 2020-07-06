package น้มุ;

import java.util.Scanner;

public class no_5554 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int a;
		int sum=0;
		for(int i=0 ; i< 4 ; i++) {
			a=input.nextInt();
			sum+=a;
		}
		System.out.printf("%d\n%d",sum/60,sum%60);
	}

}
