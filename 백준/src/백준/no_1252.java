package น้มุ;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class no_1252 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer token = new StringTokenizer(read.readLine());
		String up = token.nextToken();
		String down = token.nextToken();
		StringBuffer up_bf = new StringBuffer();
		StringBuffer down_bf = new StringBuffer();
		StringBuffer output = new StringBuffer();
		up_bf.append(up);
		down_bf.append(down);
		int time = up_bf.length() > down_bf.length() ? up_bf.length() : down_bf.length();
		int up_count = up_bf.length();
		int down_count = down_bf.length();
		up_bf = up_bf.reverse();
		down_bf = down_bf.reverse();
		int i = 0;
		for (; (up_count != i && down_count != i); i++) {
			int up_int = Integer.parseInt(up_bf.charAt(i) + "");
			int down_int = Integer.parseInt(down_bf.charAt(i) + "");
			output.append((up_int + down_int) + "");
		}
		if (up_count > down_count)
			while (up_count > i) {
				int up_int = Integer.parseInt(up_bf.charAt(i++) + "");
				output.append(up_int + "");
			}
		else if (down_count > up_count)
			while (down_count > i) {
				int down_int = Integer.parseInt(down_bf.charAt(i++) + "");
				output.append(down_int + "");
			}

		int carry = 0;
		StringBuffer last_output = new StringBuffer();
		for (int j = 0; j < output.length(); j++) {
			last_output.append(((Integer.parseInt(output.charAt(j) + "") + carry) % 2 + ""));
			carry = (Integer.parseInt(output.charAt(j) + "") + carry) / 2;
		}
		if (carry == 1) {
			last_output.append(1);
		}
		last_output.reverse();
		while (true) {
			if(last_output.length()==0||last_output.charAt(0) != '0')
				break;
			last_output.deleteCharAt(0);
		}
		if (last_output.length()==0) {
			System.out.println(0);
		} else {
			System.out.println(last_output);
		}
	}

}
