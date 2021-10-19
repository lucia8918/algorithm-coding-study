package com.company.part04.prefixsum.q0sectionsum;

import java.util.Arrays;

public class Solution {

  /**
   * 구간 합 빠르게 계산하기<br>
   * 특정 배열에서 L, R 인덱스 사이의 구간 합을 구하라<br>
   *
   * @param numbers
   * @param L 왼쪽 포지션 1부터 시작
   * @param R 오른쪽 포지션
   * @return
   */
  public static int solution(int[] numbers, int L, int R) {

    // 구간합 배열을 선언
    int[] prefixSum = new int[numbers.length + 1];

    for (int i = 1; i < prefixSum.length; i++) {
      prefixSum[i] = prefixSum[i - 1] + numbers[i - 1];
    }
    System.out.println(Arrays.toString(prefixSum));
    return prefixSum[R] - prefixSum[L - 1];
  }
}
