package ACMICPC;

import java.util.InputMismatchException;
import java.util.Scanner;

/*
 * 2007년 ( https://www.acmicpc.net/problem/1924 )
 */
public class _1924 {
	public static void main(String[] args) throws Exception{
		Scanner sc = new Scanner(System.in);
		String[] dayOfWeek = {"SUN", "MON", "TUE", "WED", "THU", "FRI", "SAT"};
		Short[] monthDays = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		try {
			Short x = sc.nextShort();
			Short y = sc.nextShort();
			int nowDays = 0;
			for(int idx = 0; idx < x; idx++) {
				nowDays += monthDays[idx];
			}
			System.out.println(dayOfWeek[(nowDays+y)%7]);
		} catch (InputMismatchException e) {
			throw new Exception("Short 형태의 값이 아닙니다.");
		}

	}

}
