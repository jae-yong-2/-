package น้มุ;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class no_10828 {
	// push = > Integer.parseInt(str.substring(str.length() - 1))

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader in = new BufferedReader(isr);
		String str = in.readLine();
		int stack_point = -1;

		int[] stack = new int[Integer.parseInt(str)];
		for (int i = 0; i < stack.length; i++) {
			str = in.readLine();

			if (str.charAt(1) == 'u') {
				StringTokenizer token =  new StringTokenizer(str);
				str = token.nextToken();
				if (str.equals("push")) { // push

					stack_point++;
					stack[stack_point] = Integer.parseInt(token.nextToken());

				}
			}

			else if (str.equals("pop")) { // pop

				if (stack_point == -1) {
					System.out.println(-1);

				} else {
					System.out.println(stack[stack_point]);
					stack_point--;
				}

			} else if (str.equals("top")) { // top
				if (stack_point == -1) {
					System.out.println(-1);
				} else {
					System.out.println(stack[stack_point]);
				}
			} else if (str.equals("empty")) { // empty
				if (stack_point == -1) {

					System.out.println(1);

				} else {

					System.out.println(0);

				}
			} else if (str.equals("size")) { // size

				System.out.println(stack_point + 1);

			}

		}
	}
}
