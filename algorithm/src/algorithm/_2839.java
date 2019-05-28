package algorithm;

import java.util.Scanner;

/*
 * 설탕 배달 ( https://www.acmicpc.net/problem/2839 )
 */
public class _2839 {
	public static void main(String[] args) {
		try {
			Scanner sc = new Scanner(System.in);
			int inputKg = sc.nextInt();
			
			System.out.println(minDelivery(inputKg));
		} catch (Exception e) {
			throw e;
		}
	}

	private static int minDelivery(int inputKg) {
		int minNumber = 9999, sum, maxMultiply5 = inputKg / 5, maxMultiply3 = inputKg / 3;
		for(int indexOf5 = maxMultiply5; indexOf5 >= 0; indexOf5--) {
			for(int indexOf3 = 0; indexOf3 <= maxMultiply3; indexOf3++) {
				sum = 5*indexOf5 + 3*indexOf3;
				if(sum == inputKg && minNumber > indexOf5 + indexOf3) {
					minNumber = indexOf5 + indexOf3;
					break;
				}
			}
		}
		return minNumber == 9999 ? -1 : minNumber;
	}

}
