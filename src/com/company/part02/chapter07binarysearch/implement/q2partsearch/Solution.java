package com.company.part02.chapter07binarysearch.implement.q2partsearch;

import static com.company.part02.chapter07binarysearch.implement.Solution.binarySearch;

import java.util.Arrays;

public class Solution {

  /**
   * 이진 탐색 파트 - Q2. 부품 찾기<br>
   *
   * @param items 가지고 있는 부품 리스트
   * @param targets 요청한 부품 리스트
   * @return
   */
  protected static String searchPart(int[] items, int[] targets) {

    Arrays.sort(items);

    for (int i = 0; i < targets.length; i++) {
      if (binarySearch(items, targets[i], 0, items.length - 1) == -1) {
        return "no";
      }
    }
    return "yes";
  }
}
