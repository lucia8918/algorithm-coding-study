package com.company.leetcode.q1_TwoSum;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class SolutionTest {

  @Test
  void test() {
    // GIVEN
    int[] nums = {2, 7, 11, 15};
    int target = 9;
    int[] expect = {0, 1};

    // When
    int[] result = Solution.twoSum(nums, target);

    // Then
    Assertions.assertThat(result).isEqualTo(expect);
  }
}
