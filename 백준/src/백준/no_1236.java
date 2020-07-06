package น้มุ;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Scanner;
import java.util.StringTokenizer;

public class no_1236 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		LinkedList<Integer> row = new LinkedList<Integer>();
		LinkedList<Integer> col = new LinkedList<Integer>();
		BufferedReader read=new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer token=new StringTokenizer(read.readLine());
		int N = Integer.parseInt(token.nextToken());
		int M = Integer.parseInt(token.nextToken());
		char castle[][] = new char[N][M];

		for (int i = 0; i < N; i++) {
			String str = read.readLine();
			for (int j = 0; j < M; j++) {
				castle[i][j] = str.charAt(j);
				if(castle[i][j]=='X') {
					if(!row.contains(i))
						row.add(i);
					if(!col.contains(j))
						col.add(j);
				}
			}
		}
		int output=0;
		if(N-row.size()>M-col.size()) {
			output=N-row.size();
		}else {
			output=M-col.size();
		}
		System.out.println(output);
	}

}
