package 백준;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class no_1302_책수 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader bf=new BufferedReader(new InputStreamReader(System.in));
		int N=Integer.parseInt(bf.readLine());
		int bookCount=0;
		String[] book=new String[1000];
		int[] count=new int[1000];
		for(int i=0 ; i< N ; i++) {
			String str = bf.readLine();
			if(Arrays.asList(book).contains(str)) {
				int t=Arrays.asList(book).indexOf(str);
				count[t]++;
			}else {
				count[bookCount]++;
				book[bookCount++]=str;
			}
		}
		int max=0;
		int maxCount=0;
		for(int i=0; i<1000 ; i++) {
			if(max<count[i]) {
				max=count[i];
			}
		}
		
		for(int i=0 ; i<1000; i++) {
			if(max==count[i]) {
				maxCount++;
			}
		}
		String[] maxBook=new String[maxCount];
		maxCount=0;
		for(int i=0 ; i<1000 ; i++) {
			if(max==count[i]) {
				maxBook[maxCount]=book[i];
				maxCount++;
			}
		}
		Arrays.sort(maxBook);
		System.out.println(maxBook[0]);
	}

}
