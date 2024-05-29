package javaAlgorithm.CHAP1;

// 빅-오메가: 최선일 때 연산 횟수를 나타낸 표기법
// 빅-세타: 보통일 때 연산 횟수를 나타낸 표기법
// 빅-오: 최악일 때 연산 횟수를 나타낸 표기법
// 모든 테스크 케이스를 통과해야 하므로 시간 복잡도는 최악일 때를 기준으로 측정한다. -> 빅-오 표기법 이용

//0~99 사이의 무작위 값을 선형 탐색하는 알고리즘
// 빅 오메가: 1
// 빅 세타: 2
// 빅 오: N
class timeComplexity {
    public static void main(String[] args) {
        int findNumber = (int)(Math.random()*100);
        for(int i = 0; i < 100; i++) {
            if(i == findNumber) {
                System.out.println(i);
                break;
            }
        }
    }
    
}