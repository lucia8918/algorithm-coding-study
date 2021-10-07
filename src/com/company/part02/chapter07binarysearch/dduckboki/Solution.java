package com.company.part02.chapter07binarysearch.dduckboki;

import java.util.Arrays;

public class Solution {

  /**
   * 이진 탐색 파트 - Q3. 떡볶이 떡 만들기<br>
   *
   * @param items 1 ~ 백만
   * @param M 1~ 20억
   * @return
   */
  protected static int makeDduck(int[] items, int M) {

    // 떡볶이 떡을 정렬
    Arrays.sort(items);

    int start = 1;
    int end = items[items.length - 1] - 1; // 최대 자르는 기게 길이
    int mid = 0;
    int sum = 0; // 잘린 떡의 합계
    // 이진탐색으로 M과 일치하는 케이스 탐색
    while (start <= end) {

      mid = (start + end) / 2;
      sum = diffSum(items, mid);
      System.out.println("mid ::: " + mid);
      System.out.println("sum ::: " + sum);

      // 찾으면
      if (sum == M) {
        return mid;

        // 잘린 떡볶이 길이의 합이 찾는 것보다 클경우
        // 기계 위치를 한칸 추가
      } else if (sum > M) {
        start = mid + 1;

        // 기계 위치를 한칸 감소
      } else {
        end = mid - 1;
      }
    }

    return -1;
  }

  // 기게 길이에 따라 짤리는 떡볶이의 길이 합을 구하는 메소드
  private static int diffSum(int[] items, int length) {
    int sum = 0;
    for (int item : items) {

      sum += (item - length) > 0 ? (item - length) : 0;
    }
    return sum;
  }
}
