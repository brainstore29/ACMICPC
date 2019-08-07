package ACMICPC;

import java.util.InputMismatchException;
import java.util.Scanner;

/*
 * 합 ( https://www.acmicpc.net/problem/8393 )
 */
public class _8393 {
	public static void main(String[] args) throws Exception{
		Scanner sc = new Scanner(System.in);
		try {
			int inputNumber = sc.nextInt();
			long sum = 0;
			for(; inputNumber > 0; inputNumber--) {
				sum += inputNumber;
			}
			System.out.println(sum);
		} catch (InputMismatchException e) {
			throw  new Exception("Short 형태의 값이 아닙니다.");
		}
	}

}
