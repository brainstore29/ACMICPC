package ACMICPC;

import java.util.Scanner;

/*
 * 별 찍기 - 4 ( https://www.acmicpc.net/problem/2441 )
 */
public class _2441 {
	static Short gapMax;
	public static void main(String[] args) throws Exception{
		Scanner sc = new Scanner(System.in);
		try {
			Short inputNumber = sc.nextShort();
			gapMax = inputNumber;
			String star = "";
			for(; inputNumber > 0; inputNumber--) {
				star = "";
				for(int innerCount = inputNumber; innerCount > 0; innerCount--) {
					star += "*";
				}
				System.out.println(gapMake(inputNumber) + star);
			}
		} catch (Exception e) {
			throw new Exception("Short 형태의 값이 아닙니다.");
		}
	}

	private static String gapMake(Short inputNumber) {
		String gap = "";
		for(; inputNumber < gapMax; inputNumber++) {
			gap += " ";
		}
		return gap;
	}
	
}
