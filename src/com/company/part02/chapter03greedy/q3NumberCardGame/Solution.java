package com.company.part02.chapter03greedy.q3NumberCardGame;

public class Solution {

  // N: 행
  // M : 열
  public int solution(int N, int M, int[][] cards) {

    int[] results = new int[N];
    int result = 0;

    for (int i = 0; i < N; i++) {
      int min = 10001;
      for (int j = 0; j < M; j++) {
        if (cards[i][j] < min) min = cards[i][j];
      }
      results[i] = min;
    }

    for (int i = 0; i < N; i++) {
      if (results[i] > result) result = results[i];
    }
    return result;
  }
}
