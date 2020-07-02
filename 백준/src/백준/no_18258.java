package น้มุ;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class no_18258 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int count = Integer.parseInt(in.readLine());
		Queue<Integer> q = new LinkedList<Integer>();
		StringTokenizer token;
		String str;
		int last = 0;
		for (int i = 0; i < count; i++) {
			token = new StringTokenizer(in.readLine());
			str = token.nextToken();
			if (str.contains("push")) {
				last=Integer.parseInt(token.nextToken());
				q.add(last);
			} else if (str.equals("pop")) {
				bw.write((q.isEmpty() ? -1 : q.poll()) +"\n");
			} else if (str.equals("size")) {
				bw.write(q.size() + "\n");
			} else if (str.equals("empty")) {
				bw.write((q.isEmpty() ? 1 : 0) +"\n");
			} else if (str.equals("front")) {
				bw.write((q.isEmpty() ? -1 : q.peek())+"\n");
			} else if (str.equals("back")) {
				bw.write((q.isEmpty() ? -1 : last)+"\n");
			}

			bw.flush();
		}
		bw.close();

	}
}