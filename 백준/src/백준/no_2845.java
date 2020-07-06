package น้มุ;

import java.util.Scanner;

public class no_2845 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		int person[]=new int[5];
		for(int i=0; i<5 ; i++) {
			person[i]=sc.nextInt();
		}
		int number=a*b;
		for(int i=0; i<5 ; i ++) {
			System.out.print(person[i]-number+" ");
		}
	}

}
