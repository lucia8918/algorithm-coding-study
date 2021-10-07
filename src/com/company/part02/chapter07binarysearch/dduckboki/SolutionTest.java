package com.company.part02.chapter07binarysearch.dduckboki;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class SolutionTest {

  @Test
  void 테스트1() {
    // Given
    int[] items = {19, 15, 10, 17};
    int M = 6;

    // When
    int result = Solution.makeDduck(items, M);

    // Then
    assertEquals(15, result);
  }

  @Test
  void 테스트12() {
    // Given
    int[] items = {19, 15, 10, 17};
    int M = 9;

    // When
    int result = Solution.makeDduck(items, M);

    // Then
    assertEquals(14, result);
  }
}
