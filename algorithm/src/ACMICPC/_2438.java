package ACMICPC;

import java.util.Scanner;

/*
 * 별 찍기 - 1 ( https://www.acmicpc.net/problem/2438 )
 */
public class _2438 {
	public static void main(String[] args) throws Exception{
		try {
			Scanner sc = new Scanner(System.in);
			short inputNumber = sc.nextShort();
			String star = "";
			for(int idx = 1; idx <= inputNumber; idx++) {
				star = star.concat("*");
				System.out.println(star);
			}
		} catch (Exception e) {
			throw e;
		}

	}

}
