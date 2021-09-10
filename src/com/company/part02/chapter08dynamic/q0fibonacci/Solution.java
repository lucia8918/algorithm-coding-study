package com.company.part02.chapter08dynamic.q0fibonacci;

public class Solution {

  public int fiboR(int N) {
    System.out.println("FIBO(" + N + ")");
    if (N == 1 || N == 2) return 1;

    return fiboR(N - 1) + fiboR(N - 2);
  }

  int[] d = new int[100];

  /**
   * 피보나치 수열 - 재귀버전 & 탑다운 메모이제이션 적용
   *
   * @param N
   * @return
   */
  public int fiboRWithTopDownMemo(int N) {
    System.out.println("FIBO(" + N + ")");
    if (N == 1 || N == 2) return 1;

    // 한번 계산한 적이 있다면 리턴
    if (d[N] != 0) return d[N];

    d[N] = fiboRWithTopDownMemo(N - 1) + fiboRWithTopDownMemo(N - 2);
    return d[N];
  }

  public int fiboWithBottomUp(int N) {

    // 1, 2 값 정의
    d[1] = 1;
    d[2] = 2;

    // 아래 부터 원하는 값까지 반복하면서 이전에 사용했던 값들을 활용
    for (int i = 2; i <= N; i++) {
      d[i] = d[i - 1] + d[i - 2];
    }
    return d[N];
  }
}
