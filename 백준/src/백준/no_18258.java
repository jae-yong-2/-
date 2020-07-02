package น้มุ;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class no_18258 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		InputStreamReader inf = new InputStreamReader(System.in);
		BufferedReader in = new BufferedReader(inf);
		String read_line = in.readLine();
		int Q_end = -1;
		int Q_start = 0;
		int Q[] = new int[Integer.parseInt(read_line)];

		for (int i = 0; i < Q.length; i++) {
			read_line = in.readLine();
			if (read_line.charAt(1) == 'u') {
				Q_end++;// push
				StringTokenizer token = new StringTokenizer(read_line);
				token.nextToken();
				Q[Q_end] = Integer.parseInt(token.nextToken());
			}
			// pop
			else if (read_line.equals("pop")) {
				if (Q_end - Q_start == -1) {
					System.out.println(-1);
				} else {
					System.out.println(Q[Q_start]);
					Q_start++;
				}
			}
			// size
			else if (read_line.equals("size")) {
				System.out.println(Q_end - Q_start + 1);
			}
			// empty
			else if (read_line.equals("empty")) {

				if (Q_end - Q_start == -1) {
					System.out.println(1);
				} else {
					System.out.println(0);
				}

			}
			// front
			else if (read_line.equals("front")) {

				if (Q_end - Q_start == -1) {
					System.out.println(-1);
				} else {
					System.out.println(Q[Q_start]);
				}
			}
			// back
			else if (read_line.equals("back")) {

				if (Q_end - Q_start == -1) {
					System.out.println(-1);
				} else {
					System.out.println(Q[Q_end]);
				}
			}
		}
	}
}
