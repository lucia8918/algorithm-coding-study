package com.company.part02.chapter03greedy.q2bignumber;

import java.util.Arrays;

public class Solution {

  /**
   * <b>그리디 Part - Q2 : 큰수의 법칙</b><br>
   * <br>
   * N개의 아이템들을 활용하여, M번 더하여 최대 값을 만드는 문제<br>
   * <br>
   * 조건 1)<br>
   * 특정 인덱스에 해당하는 수가 연속해서 K번으 초과 하여 더해 질 수없다<br>
   *
   * @param N : 아이템 개수 (2~1000)
   * @param M : 총 더해지는 횟수 (1~10000)
   * @param K : 1싸이클 최대 반복 사용 개수 (1~10000)
   * @param items : 아이템 정보
   * @return 만들 수 있는 최대 값
   */
  public int solution(int N, int M, int K, int[] items) {

    int result = 0; // 결과 값

    Arrays.sort(items); // DualPivotQuicksort, O(NlogN)
    int firstMaxValue = items[N - 1];
    int secondMaxValue = items[N - 2];

    int count = 0;
    for (int i = 0; i < M; i++) {
      if (count < K) {
        count++;
        result += firstMaxValue;
      } else {
        count = 0;
        result += secondMaxValue;
      }
    }

    return result;
  }
}
