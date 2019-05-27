package algorithm;

import java.util.Scanner;

/*
 * 연속합 ( https://www.acmicpc.net/problem/1912 )
 */
public class _1912 {
	public static void main(String[] args) throws Exception{
		try {
			Scanner sc = new Scanner(System.in);
			int[] numArr = new int[sc.nextInt()];
			int idx = 0;
			sc.skip("[\\r\\n]+");
			for(String str : sc.nextLine().split(" ")) {
				numArr[idx++] = Integer.parseInt(str);
			}
			
			System.out.println(contNumCheck(numArr));
			
		} catch (Exception e) {
			throw e;
		}
	}

	private static int contNumCheck(int[] arr) {
		int[] indexSum = new int[arr.length + 1];
		int mostSum = arr[0];
		indexSum[0] = mostSum;
		for(int idx = 1; idx < arr.length; idx++) {
			indexSum[idx] = Math.max(indexSum[idx-1] + arr[idx], arr[idx]);
			mostSum = Math.max(indexSum[idx],  mostSum);
		}
		
		return mostSum;
	}
}
