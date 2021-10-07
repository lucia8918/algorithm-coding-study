package com.company.part02.chapter07binarysearch.q2partsearch;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class SolutionTest {

  @Test
  void 테스트() {
    // Given
    int[] N = {8, 3, 7, 9, 2};
    int[] M = {3, 7, 9};

    // When
    String result = Solution.searchPart(N, M);

    // Then
    assertEquals("yes", result);
  }

  @Test
  void 테스트2() {
    // Given
    int[] N = {8, 3, 7, 9, 2};
    int[] M = {99, 7, 9};

    // When
    String result = Solution.searchPart(N, M);

    // Then
    assertEquals("no", result);
  }
}
