package algorithm;

import java.util.Scanner;

/*
 * 구구단 ( https://www.acmicpc.net/problem/2739 )
 */
public class _2739 {
	public static void main(String[] args) throws Exception{
		try {
			Scanner sc = new Scanner(System.in);
			short inputNumber = sc.nextShort();
			for(int idx = 1; idx < 10; idx++) {
				System.out.println(inputNumber + " * " + idx + " = " + inputNumber*idx);
			}
			sc.close();
		} catch (Exception e) {
			throw e;
		}
		

	}

}
