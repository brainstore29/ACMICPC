package algorithm;

import java.util.Scanner;

/*
 * 별 찍기 - 2 ( https://www.acmicpc.net/problem/2439 )
 */
public class _2439 {
	public static void main(String[] args) throws Exception{
		Scanner sc = new Scanner(System.in);
		try {
			short inputNumber = sc.nextShort();
			String star = "";
			for(int idx = 1; idx <= inputNumber; idx++) {
				star += "*";
				System.out.println(gapMake(inputNumber - idx)+ star);
			}
		} catch (Exception e) {
			throw new Exception("Short 형태의 값이 아닙니다.");
		} finally{
			sc.close();
		}
	}

	private static String gapMake(int numberOfGap) {
		String gap = "";
		for(; numberOfGap > 0; numberOfGap--) {
			gap += " ";
		}
		return gap;
	}

}
