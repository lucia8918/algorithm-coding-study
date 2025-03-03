package com.company.leetcode.TopInterviewQuestions.easycollection.array;

import java.util.Arrays;

public class RotateArray {

  public void rotate(int[] nums, int k) {

    int rotate = 0;

    // 길이보다 로테이션이 작은 경우
    if (nums.length > k) {
      rotate = k;

      // 길이 보다 로테이션이 많은 경우
    } else if (nums.length < k) {

      rotate = nums.length % k;
    } else {
      return;
    }

    // nums.length : 5
    // k = 1
    int[] tail = Arrays.copyOfRange(nums, 0, nums.length - rotate - 1); // 0~4-1)
    int[] front = Arrays.copyOfRange(nums, nums.length - rotate, nums.length - 1);

    int pos = 0;
    for (int j = 0; j < front.length; j++) {
      nums[pos++] = front[j];
    }
    for (int j = 0; j < tail.length; j++) {
      nums[pos++] = front[j];
    }
  }
}
