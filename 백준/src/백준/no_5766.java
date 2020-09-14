package น้มุ;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class no_5766 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		Map<String, Integer> hsMap = new HashMap<>();

		while (true) {
			StringTokenizer st = new StringTokenizer(bf.readLine());
			int N = Integer.parseInt(st.nextToken());
			int M = Integer.parseInt(st.nextToken());
			if (N == 0 && M == 0)
				return;
			for (int j = 0; j < N; j++) {
				st = new StringTokenizer(bf.readLine());
				for (int i = 0; i < M; i++) {
					String str = st.nextToken();

					if (!hsMap.containsKey(str))
						hsMap.put(str, 0);
					else
						hsMap.put(str, hsMap.get(str) + 1);
				}
			}
		}
	}

}
