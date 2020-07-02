package น้มุ;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class no_18258 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		String read_line = in.readLine();
		int Q_end = -1;
		int Q_start = 0;
		int size = 0;
		String Q[] = new String[Integer.parseInt(read_line)];
		for (int i = 0; i < Q.length; i++) {
			read_line = in.readLine();
			// push
			if (read_line.charAt(1) == 'u') {
				StringTokenizer token = new StringTokenizer(read_line);
				token.nextToken();
				Q_end++;
				size++;
				Q[Q_end] = token.nextToken();
			}
			// pop
			else if (read_line.equals("pop")) {
				if (size == 0) {
					System.out.println(-1);
				} else {
					System.out.println(Q[Q_start]);
					Q_start++;
					size--;
				}
			}
			// size
			else if (read_line.equals("size")) {
				System.out.println(size);
			}
			// empty
			else if (read_line.equals("empty")) {

				if (size == 0) {
					System.out.println(1);
				} else {
					System.out.println(0);
				}

			}
			// front
			else if (read_line.equals("front")) {

				if (size == 0) {
					System.out.println(-1);
				} else {
					System.out.println(Q[Q_start]);
				}
			}
			// back
			else if (read_line.equals("back")) {

				if (size == 0) {
					System.out.println(-1);
				} else {
					System.out.println(Q[Q_end]);
				}
			}
		}
	}
}
