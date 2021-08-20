package com.company.part02.chapter03greedy.q2bignumber;

import java.util.Arrays;

public class Solution {

  public int solution(int[] condition, int[] items) {

    int result = 0; // 결과 값

    int N = condition[0]; // 배열의 크기

    int M = condition[1]; // 더해지는 횟수

    int K = condition[2]; // 최대 사용 개수

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
