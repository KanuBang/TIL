package javaAlgorithm.CHAP1;
import java.util.Scanner;

// 입력 -> 시간 제한 -> 시간 복잡도 따지기

/* 입력
   첫째 줄에 수의 개수 N(1 ≤ N ≤ 1,000,000)이 주어진다. 둘째 줄부터 N개의 줄에는 수가 주어진다. 
   이 수는 절댓값이 1,000보다 작거나 같은 정수이다. 수는 중복되지 않는다.
*/

/* 시간 제한
 * 2초 -> 2억 번 이하의 연산 횟수로 문제를 해결 해야 한다.
 */

/* 시간 복잡도
 * N^2 = 1,000,000,000,000 -> 시간 제한 초과
 * NlogN = 1000000 * 6 -> 적합
 */
public class 입력_시간제한_복잡도 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < arr.length; i++){
            arr[i] = scanner.nextInt();
        }
        
    }
}
