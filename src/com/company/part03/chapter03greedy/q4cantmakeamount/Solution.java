package com.company.part03.chapter03greedy.q4cantmakeamount;

import java.util.Arrays;
import java.util.Collections;

public class Solution {

  /**
   * 파트3 기출문제 - 그리디<br>
   * Q4 - 만들 수 없는 금액<br>
   * 동전들을 가지고 만들수없는 최소한의 금액을 출력<br>
   * Eg, [3, 2, 1, 1, 9]원 짜리 동전은 만들수 없는 최소한의 금액은 8 <br>
   * Eg, [3, 5, 7]원 짜리 동전은 만들수 없는 최소한의 금액은 1
   *
   * @param N 동전정보
   * @return
   */
  public int solution(int[] N) {

    // 만들수 없는 최소한의 양수값

    // 우선 내림차순으로 정렬
    Integer[] coins =
        Arrays.stream(N).boxed().sorted(Collections.reverseOrder()).toArray(Integer[]::new);

    // 최대 만들수있는 양의 정수
    int limit = 0;
    for (int i = 0; i < coins.length; i++) limit += coins[i];

    for (int target = 1; target <= limit; target++) {

      int sum = 0;

      for (int i = 0; i < coins.length; i++) {

        // 현재 동전으로 타겟값을 못만드는 경우 PASS
        if (target < coins[i]) continue;

        // 더해서 값이 나오는 경우
        if (target == sum + coins[i]) {
          System.out.println(coins[i] + " = 더해서 만들어 진다." + target);
          sum = target;
          break;

          // 더해서 현재 타겟값보다 적은 경우 ++
        } else if (target > sum + coins[i]) {
          System.out.print(coins[i] + " ");
          sum += coins[i];
        }
      }

      // 모든 동전을 통해서 못만드는 경우 해당 타겟값 리턴
      if (target != sum) return target;
    }

    // 모두 만들수있는 경우
    return 0;
  }
}
