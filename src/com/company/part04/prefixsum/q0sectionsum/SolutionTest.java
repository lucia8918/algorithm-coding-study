package com.company.part04.prefixsum.q0sectionsum;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class SolutionTest {

  @Test
  void 테스트1() {
    // Given
    int[] numbers = {10, 20, 30, 40, 50};
    int L = 2;
    int R = 3;

    // When
    int result = Solution.solution(numbers, L, R);

    // Then
    assertEquals(50, result);
  }
}
