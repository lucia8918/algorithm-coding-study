package com.company.part02.chapter08dynamic.q3ant;

public class Solution {

  /**
   * 개미 식량 창고
   *
   * @param K
   * @return
   */
  public int solution(int[] K) {

    int[] dp = new int[K.length];

    // 1, 2번째 셋팅
    dp[0] = K[0];
    dp[1] = K[1];

    for (int i = 2; i < K.length; i++) {
      dp[i] = Math.max(dp[i - 1], dp[i - 2] + K[i]);
    }

    return dp[K.length - 1];
  }
}
