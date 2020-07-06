package น้มุ;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.StringTokenizer;

public class no_15700 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader read=new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer token=new StringTokenizer(read.readLine());
		BigInteger N=new BigInteger(token.nextToken());
		BigInteger M=new BigInteger(token.nextToken());
		System.out.println(N.multiply(M).divide(BigInteger.valueOf(2)));
	}

}
