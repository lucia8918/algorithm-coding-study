package com.company.part02.chapter03greedy.q1coin;

public class Solution {

  /**
   * <b>그리디 Part - Q1 : 거스름돈 </b><br>
   * 거슬러 줘야 할 동전의 최소 개수를 구하라.
   *
   * @param amount 거스름돈 총금액
   * @param coins 동전 리스트
   * @return 최소 잔돈 개수
   */
  public int solution(int amount, int[] coins) {

    int count = 0; // 잔돈 개수

    // 내림 차순 정렬 가정
    for (int coin : coins) {
      count += amount / coin; // 해당 잔돈으로 거슬러 줄 수 있는 개수
      amount %= coin; // 해당 잔돈으로 거슬러주고 남은 금액

      if (amount == 0) break;
    }

    return count;
  }
}
