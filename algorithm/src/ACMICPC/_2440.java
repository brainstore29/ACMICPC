package ACMICPC;

import java.util.Scanner;

/*
 * 별 찍기 - 3 ( https://www.acmicpc.net/problem/2440 )
 */
public class _2440 {
	public static void main(String[] args) throws Exception{
		Scanner sc = new Scanner(System.in);
		try {
			short inputNumber = sc.nextShort();
			String star = "";
			for(; inputNumber > 0; inputNumber--) {
				star = "";
				for(int innerCount = inputNumber; innerCount > 0; innerCount--) {
					star += "*";
				}
				System.out.println(star);
			}
		} catch (Exception e) {
			throw new Exception("Short 형태의 값이 아닙니다.");
		} finally {
			sc.close();
		}

	}
}
