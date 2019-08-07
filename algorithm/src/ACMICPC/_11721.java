package ACMICPC;

import java.util.Scanner;

/*
 * 열 개씩 끊어 출력하기 ( https://www.acmicpc.net/problem/11721 )
 */
public class _11721 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		try {
			String inputString = sc.nextLine();
			for(int idx = 0; idx < inputString.length(); idx += 10) {
				System.out.println(inputString.substring(idx, idx + 10 <= inputString.length() ? idx + 10 : inputString.length()));
			}
		} catch ( Exception e) {
			throw e;
		} finally {
			sc.close();
		}
	}
}
