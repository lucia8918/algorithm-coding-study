package com.company.leetcode.q136_SingleNumber;

public class Solution {

  // XOR : 두비트가 다르면 1, 아니면 0
  public int singleNumber(int[] nums) {

    int ret = 0;
    for (int num : nums) {
      ret = ret ^ num;
    }
    return ret;
  }
}
