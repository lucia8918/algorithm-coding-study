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
  public int fiboRWithMemo(int N) {
    System.out.println("FIBO(" + N + ")");
    if (N == 1 || N == 2) return 1;

    // 한번 계산한 적이 있다면 리턴
    if (d[N] != 0) return d[N];

    d[N] = fiboRWithMemo(N - 1) + fiboRWithMemo(N - 2);
    return d[N];
  }
}
