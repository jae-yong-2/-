package 백준;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class no_5637_긴단어 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		String match = "[^xfe0-9a-zA-Z\\s-]";
		BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
		String max_str = "";
		while (true) {
			String str = read.readLine();
			if(str.equals(""))
				str=read.readLine();
			str = str.replaceAll(match, "");
			StringTokenizer token = new StringTokenizer(str);
			str = token.nextToken();
			
			if (str.equals("E-N-D")) {
				System.out.println(max_str);
				return;
			}
			
			while (token.hasMoreTokens()) {
				if (max_str.length() < str.length()) {
					max_str = str;
				}
				str=token.nextToken();
				if (str.equals("E-N-D")) {
                    max_str=max_str.toLowerCase();
					System.out.println(max_str);
					return;
				}
			}
		}
	}

}
