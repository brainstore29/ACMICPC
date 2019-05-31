package algorithm;

import java.util.Scanner;

/*
 * 숫자의 합 ( https://www.acmicpc.net/problem/11720 )
 */
public class _11720 {
	public static void main(String[] args) throws Exception{
		Scanner sc = new Scanner(System.in);
		try {
			byte inputNumber = sc.nextByte();
			sc.skip("[\\r\\n]+");
			String numberList = sc.nextLine();
			int sum = 0;
			for(int idx = 0; idx < numberList.length(); idx++) {
				sum += numberList.charAt(idx) - '0';	// ASCII CODE 0: 48
			}
			System.out.println(sum);
		} catch (Exception e) {
			throw e;
		} finally {
			sc.close();
		}
	}
}
