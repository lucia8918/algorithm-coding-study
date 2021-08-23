package com.company.part02.chapter03greedy.q3numbercardgame;

public class Solution {

  /**
   * <b>그리디 Part - Q3 : 숫자 카드 게임</b><br><br>
   * 특정 행을 선책 했을때, 해당 행에 존재 하는 카드 중 가장 낮은 카드를 뽑는다<br>
   * 이때에 가장 높은 행을 선책 하는 방법을 찾아라
   *
   * @param N : 행 개수
   * @param M : 열 개수
   * @param cards : 카드 정보 어레이
   * @return 가장 높은 값을 리턴해 주는 행 번호
   */
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
