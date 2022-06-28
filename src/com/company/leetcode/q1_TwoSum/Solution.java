package com.company.leetcode.q1_TwoSum;

import java.util.HashMap;

public class Solution {
  public static int[] twoSum(int[] nums, int target) {

    // 대안 1.
    // 시간 복잡도 O(N^2), 공간 복잡도 O(1)
    for (int i = 0; i < nums.length; i++) {
      for (int j = i + 1; j < nums.length; j++) {
        if (nums[i] + nums[j] == target) return new int[] {i, j};
      }
    }

    // 대안 2.
    // 시간 복잡도 O(N), 공간 복잡도 O(N)
    HashMap<Integer, Integer> map = new HashMap<>(); // key : 값, value : idx

    for (int i = 0; i < nums.length; i++) {
      if (map.containsKey(target - nums[i])) {
        return new int[] {map.get(target - nums[i]), i};
      } else {
        map.put(nums[i], i);
      }
    }

    return null;
  }
}
