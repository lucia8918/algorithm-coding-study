package com.company.part03.chapter03greedy.q05bowlingball;

public class Solution {

  /**
   * 파트3 기출문제 - 그리디<br>
   * Q5 - 볼링공 고르기<br>
   * A, B 두명에서 볼링을 치는데, 서로 무게가 다른 볼링공을 고르는 조합의 수<br>
   *
   * @param ballWeights 볼링공 무게 정보들
   * @param M 최대 무개 정보
   * @return
   */
  public static int selectBowlingBall(int[] ballWeights, int M) {

    int result = 0;
    int[] count = new int[M + 1]; // 1~M 까지 처리 위해

    // 각각의 공의 무게 정보를 map 에 정의
    for (int ballWeight : ballWeights) {
      count[ballWeight]++;
    }

    for (int i = 1; i < count.length; i++) {
      int sum = sum(count, i + 1, M); // 자기 자신보다 무게가 많이 나가는 공의 개수 SUM
      result += count[i] * sum; // 현재 무게의 총 개수 * 자신보다 무게 많이 나가는 공의 총 개수
    }

    return result;
  }

  private static int sum(int[] arr, int offset, int max) {
    int sum = 0;
    for (int i = offset; i <= max; i++) {
      sum += arr[i];
    }
    return sum;
  }
}
