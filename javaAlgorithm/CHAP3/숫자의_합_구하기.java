package javaAlgorithm.CHAP3;

import java.util.Scanner;

public class 숫자의_합_구하기 {
    public static void main(String[] args) {
        // 1. 입력을 받는다.
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        String sNum = scanner.next();

        // 문자열을 문자 배열로 변환한다.
        char[] cNum = sNum.toCharArray();
        int sum = 0;

        // 2. 변환을 한 다음 차례 차례 더한다.
        for(char c : cNum) {
            sum += c - '0';
        }
        // 3. 출력한다.
        System.out.println(sum);
    }
}
