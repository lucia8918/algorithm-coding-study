package com.company.part02.chapter05dfsbfs.q0factorial;

public class Solution {

  /**
   * 팩토리얼 - 반복 문 버전<br>
   * n! = 1*2*3*,,,,*(n-1) * n<br>
   * 0!, 1! = 1이다.
   *
   * @param N
   * @return
   */
  public int factorial(int N) {
    int result = 1;
    for (int i = 1; i <= N; i++) {
      result = result * i;
    }
    return result;
  }

  /**
   * 팩토리얼 - 재귀함수 버전<br>
   * n! = 1*2*3*,,,,*(n-1) * n<br>
   * 0!, 1! = 1이다.
   *
   * @return
   */
  public int factorialR(int N) {
    if (N <= 1) return 1;

    return N * factorialR(N - 1);
  }
}
