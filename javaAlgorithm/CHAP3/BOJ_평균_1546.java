package javaAlgorithm.CHAP3;

import java.util.Scanner;

public class BOJ_평균_1546 {
   public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    // 1. 입력을 받는다.
    int n = sc.nextInt();
    int[] num_arr = new int[n];
    for(int i = 0; i < n; i++) {
        num_arr[i] = sc.nextInt();
    }
    // 2. 가장 큰 숫자를 찾는다.
    int max = 0;
    double sum = 0;
    for(int num : num_arr){
        if (num > max) {
            max = num;
        }
        sum += num;
    }
    // 3. 가장 큰 숫자로 각 숫자를 나누고 더한다. 100을 곱하고 3으로 나눈다
    sum = sum / max * 100 / n;

    // 4. 출력한다.
    System.out.println(sum);
   } 
}
