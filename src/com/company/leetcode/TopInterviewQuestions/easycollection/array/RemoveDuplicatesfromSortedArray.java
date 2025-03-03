package com.company.leetcode.TopInterviewQuestions.easycollection.array;

import java.util.HashSet;

public class RemoveDuplicatesfromSortedArray {

  // 내 풀이
  public int removeDuplicates(int[] nums) {
    HashSet<Integer> doc = new HashSet<>();

    for (int i = 0; i < nums.length; i++) {
      if (doc.add(nums[i])) {
        nums[doc.size() - 1] = nums[i];
      }
    }

    return doc.size();
  }

  // 투포인터 사용
  public int removeDuplicates_(int[] nums) {
    if (nums.length == 0) return 0; // 빈 배열 예외 처리

    int left = 1; // 중복 없는 숫자가 저장될 위치

    for (int right = 1; right < nums.length; right++) {
      if (nums[right] != nums[right - 1]) { // 중복이 아닌 경우만 이동
        nums[left] = nums[right];
        left++; // 다음 위치 이동
      }
    }
    return left; // 중복을 제거한 후의 길이 반환
  }
}
