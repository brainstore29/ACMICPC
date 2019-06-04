package algorithm;

import java.util.Scanner;

/*
 * 세 수 ( https://www.acmicpc.net/problem/10817 )
 */
public class _10817 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		try {
			short num1, num2, num3;
			num1 = sc.nextShort();
			num2 = sc.nextShort();
			num3 = sc.nextShort();
			
			System.out.println(secondMax(num1, num2, num3));
		} catch (Exception e) {
			throw e;
		} finally {
			sc.close();
		}
	}

	private static short secondMax(short num1, short num2, short num3) {
		if(num1 >= num2 && num1 >= num3) {
			return num2 >= num3 ? num2 : num3;
		}
		else if(num2 >= num1 && num2 >= num3){
			return num1 >= num3 ? num1 : num3;
		}
		else {
			return num1 >= num2 ? num1 : num2;
		}
	}
}
