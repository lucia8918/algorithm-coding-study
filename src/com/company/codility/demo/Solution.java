package com.company.codility.demo;

import java.util.Arrays;
import java.util.HashSet;

public class Solution {

  public int solution(int[] A) {

    Arrays.sort(A);
    HashSet<Integer> results = new HashSet<>();
    int maxNumber = 1;

    for (int number : A) {
      if (maxNumber < number) maxNumber = number;
      if (number > 0) results.add(number);
    }

    if (results.isEmpty()) return maxNumber;

    for (int i = 1; i <= results.size(); i++) {
      if (results.contains(i)) continue;
      return i;
    }

    return maxNumber + 1;
  }

  public static void main(String[] args) {
    Solution solution = new Solution();
  }
}
