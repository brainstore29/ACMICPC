package algorithm;

import java.util.Scanner;

/*
 * 기찍 N ( https://www.acmicpc.net/problem/2742 )
 */
public class _2742 {

	public static void main(String[] args) throws Exception {
		try {
			Scanner sc = new Scanner(System.in);
			for(int idx = sc.nextInt(); idx > 0 ; idx--) {
				System.out.println(idx);
			}
		} catch (Exception e) {
			throw new Exception("입력받은 값이 Integer값이 아닙니다.");
		}
	}

}
