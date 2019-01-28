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
		int mostSum = 0, currentSum = 0;
		for(int idx = 0; idx < arr.length; idx++) {
			currentSum = 0;
			for(int subIdx = idx; subIdx < arr.length; subIdx++) {
				if(arr[subIdx] < 0) {
					if(mostSum < currentSum) {
						mostSum = currentSum;
					}
					break;
				}
				currentSum += arr[subIdx];
			}
		}
		return mostSum;
	}

}
