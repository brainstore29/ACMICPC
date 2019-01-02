package algorithm;

import java.util.Scanner;

/*
 * 더하기 사이클 ( https://www.acmicpc.net/problem/1110 )
 */
public class _1110 {
	public static void main(String[] args) throws Exception{
		try {
			Scanner sc = new Scanner(System.in);
			int num = sc.nextInt();
			
			if(num <0 || num > 99) { throw new Exception("N은 0보다 크거나 같고, 99보다 작거나 같은 정수여야 합니다."); }
			
			System.out.println(cycleLength(num, num, 0));
		} catch (Exception e) {
			throw e;
		}
	}

	private static int cycleLength(int originNum, int presentNum, int cycleCount) {
		int quotient, reminder, resultNum;
		if(presentNum < 10) {
			resultNum = presentNum * 10 + presentNum;
			if (resultNum == originNum) return ++cycleCount;
			else cycleCount = cycleLength(originNum, resultNum, ++cycleCount);
		}
		else {
			quotient = presentNum / 10;
			reminder = presentNum % 10;
			resultNum = reminder * 10 + (quotient + reminder) % 10;
			if(resultNum == originNum) return ++cycleCount;
			else cycleCount = cycleLength(originNum, resultNum, ++cycleCount);
		}
		return cycleCount;
	}
}
