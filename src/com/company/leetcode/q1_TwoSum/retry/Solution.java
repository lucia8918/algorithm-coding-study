package com.company.leetcode.q1_TwoSum.retry;

import java.util.HashMap;

public class Solution {

  public int[] twoSum(int[] nums, int target) {

    HashMap<Integer, Integer> doc = new HashMap<>();
    for (int i = 0; i < nums.length; i++) {
      if (doc.containsKey(target - nums[i])) return new int[] {doc.get(target - nums[i]), i};
      doc.put(nums[i], i);
    }

    return new int[] {0, 1};
  }

  public static void main(String[] args) {}
}
