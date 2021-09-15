package com.company.part03.chapter03greedy.q1adventurerguild;

import java.util.Arrays;

public class Solution {

  /**
   * 파트3 기출문제 - 그리디<br>
   * Q1 - 모험가 길드<br>
   * 공포도 X인 사람은 X명이상 그룹에 포함 해야 한다.<br>
   * 이때 여행을 떠날수 있는 그룹수의 최댓값
   *
   * @param N
   * @return
   */
  public int solution(int[] N) {

    int result = 0;

    Arrays.sort(N); // 항상 최소한의 인원수로 그룹을 유지하면 최대의 그룹을 만들 수 있다.

    int currentMemberCount = 0;
    int maxFear = 0; // 공포도 max 값
    String member = "";
    for (int i = 0; i < N.length; i++) {

      if (maxFear == 0 || maxFear < N[i]) maxFear = N[i];

      currentMemberCount++;
      member = member + " " + N[i];

      if (maxFear == currentMemberCount) {
        result++;
        maxFear = 0;
        currentMemberCount = 0;
        System.out.println(member);
        member = "";
      }
    }

    return result;
  }
}
