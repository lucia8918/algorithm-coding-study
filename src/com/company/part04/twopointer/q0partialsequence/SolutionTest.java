package com.company.part04.twopointer.q0partialsequence;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class SolutionTest {

  @Test
  void 테스트1() {
    // Given
    int[] numbers = {1, 2, 3, 2, 5};
    int M = 5;

    // When
    int result = Solution.solution(numbers, M);

    // Then
    assertEquals(3, result);
  }
}
