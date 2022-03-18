package com.company.part02.chapter03greedy.retry1.q3;

public class Solution {

  public int solution(int[][] cards) {

    int[] results = new int[cards.length];

    for (int i = 0; i < cards.length; i++) {

      int min = 10001;
      for (int number : cards[i]) {
        if (min > number) min = number;
      }
      results[i] = min;
    }

    int result = 0;
    for (int i = 0; i < cards.length; i++) {
      if (result < results[i]) result = results[i];
    }
    return result;
  }
}
