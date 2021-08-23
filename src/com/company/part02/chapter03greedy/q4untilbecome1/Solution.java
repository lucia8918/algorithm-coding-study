package com.company.part02.chapter03greedy.q4untilbecome1;

public class Solution {

  /**
   * N의 값이 1이 될때까지<br>
   * 아래의 2가지 방법을 반복할 경우 최소 횟수<br>
   * 방법 1: N-1<br>
   * 방법 2: N이 K로 나누어 지는 경우 -> N/K
   *
   * @param N : 초기 값
   * @param K : 나누는게 가능 한 수
   * @return
   */
  public int solution(int N, int K) {
    int result = 0;
    while (N > 1) {
      N = N % K == 0 ? N / K : N - 1;
      result++;
    }
    return result;
  }
}
