package com.company.programmers.level01.lotto;

// https://programmers.co.kr/learn/courses/30/lessons/77484
public class Solution {

  public int[] solution(int[] lottos, int[] win_nums) {

    boolean correctFlag = false;
    int correctCount = 0;
    int unknownCount = 0;
    int failCount = 0;

    for (int lotto : lottos) {
      correctFlag = false;
      for (int win_num : win_nums) {
        if (lotto == win_num) {
          correctFlag = true;
          break;
        }
      }
      if (lotto == 0) unknownCount++;
      else if (correctFlag) correctCount++;
      else failCount++;
    }

    if (failCount == 6) return new int[] {6, 6};
    if (correctCount == 6) return new int[] {1, 1};
    if (correctCount == 0) return new int[] {1, 6};

    int maxRank = getRank(correctCount + unknownCount);
    int minRank = getRank(correctCount);
    return new int[] {maxRank, minRank};
  }

  private int getRank(int correctCount) {
    if (correctCount > 1) return 7 - correctCount;
    else return 6;
  }
}
