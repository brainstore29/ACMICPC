package algorithm;

import java.util.Scanner;

public class _2741 {
	public static void main(String[] args) throws Exception{
        try{
            Scanner sc = new Scanner(System.in);
            int maxNum = sc.nextInt();
            for(int idx = 1; idx <= maxNum; idx++){
                System.out.println(idx);
            }
        } catch ( Exception e){
            throw e;
        }
    }
}