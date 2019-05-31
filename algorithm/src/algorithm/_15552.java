package algorithm;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

/*
 * 빠른 A+B ( https://www.acmicpc.net/problem/15552 )
 */
public class _15552 {
	public static void main(String[] args) throws Exception {
		try {
			InputStreamReader isr = new InputStreamReader(System.in);
			BufferedReader br = new BufferedReader(isr);
			OutputStreamWriter osw = new OutputStreamWriter(System.out);
			BufferedWriter bw = new BufferedWriter(osw);
			
			int inputCase = Integer.parseInt(br.readLine());
			for(int idx = 0; idx < inputCase; idx++) {
				String[] tempSet = br.readLine().split(" ");
				bw.write((Integer.parseInt(tempSet[0]) + Integer.parseInt(tempSet[1])) + "\n");
			}
			bw.flush();
			bw.close();
			br.close();
		} catch ( Exception e) {
			throw e;
		}
	}

}
