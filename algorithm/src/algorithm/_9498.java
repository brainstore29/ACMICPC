package algorithm;

import java.util.Scanner;

/*
 * 시험 성적 ( https://www.acmicpc.net/problem/9498 )
 */
public class _9498 {
	public static void main(String[] args) throws Exception{
		Scanner sc = new Scanner(System.in);
		try {
			final String grade;
			short inputScore = sc.nextShort();
			if(inputScore > 100 || inputScore < 0) {
				throw new IllegalArgumentException("성적의 범위가 올바르지 않습니다.");
			}
			if(inputScore >= 90 && inputScore <= 100) {
				grade = "A";
			}
			else if(inputScore >= 80 && inputScore <= 89) {
				grade = "B";
			}
			else if(inputScore >= 70 && inputScore <= 79) {
				grade = "C";
			}
			else if(inputScore >= 60 && inputScore <= 69) {
				grade = "D";
			}
			else {
				grade = "F";
			}
			System.out.println(grade);
		} catch (Exception e) {
			throw e;
		} finally {
			sc.close();
		}
	}
}
