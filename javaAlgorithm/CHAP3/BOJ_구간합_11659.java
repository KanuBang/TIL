package javaAlgorithm.CHAP3;

import java.util.*;

public class BOJ_구간합_11659 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // 1. N, M을 받는다.
        int n, m = 0;
        n = sc.nextInt();
        m = sc.nextInt();
        
        // 2. N개의 숫자를 배열에 저장하면서 입력을 받으면서 구간 합을 배열도 완성한다.
        int[] nums = new int[n+1];
        int[] sumArr = new int[n+1];
        nums[0] = 0;
        sumArr[0] = 0;
        for(int i = 1; i < nums.length; i++) {
            nums[i] = sc.nextInt();
            if (i == 0) {
                sumArr[i] = nums[i];
            } else{
                sumArr[i] = sumArr[i-1] + nums[i];
            }
            
        }

        // 3. i,j를 입력 받든다.
        int i, j = 0;
        for(int a = 0; a < m; a++){
            i = sc.nextInt(); // 2
            j = sc.nextInt(); // 4
            // 0~2의 숫자 합을 원함.
            // s[1] = 1, s[2] = 1 + 2 , s[3] = 1 + 2 + 3, s[4] = 1 + 2 + 3 + 4 
            System.out.println(sumArr[j] - sumArr[i-1]);
        }
    }
    
}