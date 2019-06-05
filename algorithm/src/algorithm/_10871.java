package algorithm;

import java.util.Scanner;

/*
 * X보다 작은 수 ( https://www.acmicpc.net/problem/10871 )
 */
public class _10871 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		try {
			int inputNumber, stdX;
			inputNumber = sc.nextInt();
			stdX = sc.nextInt();
			sc.skip("[\\r\\n]+");
			String[] checkNumber = sc.nextLine().split(" ");
			String output = "";
			for(int idx = 0; idx < checkNumber.length; idx++) {
				output += Integer.valueOf(checkNumber[idx]) < stdX ? " " + checkNumber[idx]: "";
			}
			
			System.out.println(output.replaceFirst(" ", ""));
			
		} catch (Exception e) {
			throw e;
		} finally {
			sc.close();
		}
	}
}
