package com.company.codility.demo.retry20260110;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

class Solution {
  /**
   * 시간 복잡도 O(N log N) 정렬떄문<br>
   * 공간 복잡도 O(1) 또는 정렬 알고리즘 추가 공간
   */
  public int solution(int[] A) {
    Arrays.sort(A);

    int target = 1;

    for (int i : A) {
      if (i == target) {
        target++;
      }
    }

    return target;
  }

  /**
   * 시간 복잡도: O(N) (배열 삽입 O(N) + 존재 여부 확인 최대 O(N))<br>
   * 공간 복잡도: $O(N) (Set에 최대 N개 저장)
   */
  public int solution2(int[] A) {
    Set<Integer> dictionary = new HashSet<>();

    int target = 1;
    int MAX_LENGTH = 1000000;

    for (int i : A) {
      dictionary.add(i);
    }

    for (int i = 1; i < MAX_LENGTH; i++) {
      if (!dictionary.contains(i)) {
        return i;
      }
    }

    return target;
  }
}
