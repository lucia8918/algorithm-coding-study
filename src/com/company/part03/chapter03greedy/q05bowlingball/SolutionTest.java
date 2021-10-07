package com.company.part03.chapter03greedy.q05bowlingball;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class SolutionTest {

  @Test
  void 테스트() {
    // Given
    int[] items = {1, 3, 2, 3, 2};
    int M = 3;

    // When
    int result = Solution.selectBowlingBall(items, M);

    // Then
    assertEquals(8, result);
  }

  void 테스트2() {
    // Given
    int[] items = {1, 5, 4, 3, 2, 4, 5, 2};
    int M = 5;

    // When
    int result = Solution.selectBowlingBall(items, M);

    // Then
    assertEquals(25, result);
  }
}
