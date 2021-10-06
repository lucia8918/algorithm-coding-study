package com.company.part02.chapter07binarysearch.implement;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class SolutionTest {

  @Test
  void 바이너리서치_반복_리컬시브_테스트() {

    // Given
    int[] list = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
    int target = 8;

    // When
    int result = Solution.binarySearch(list, target, 0, list.length - 1);
    int result2 = Solution.binarySearchR(list, target, 0, list.length - 1);

    // Then
    assertEquals(7, result);
    assertEquals(7, result2);
  }

  @Test
  void 바이너리서치_리컬시브_테스트2() {

    // Given
    int[] list = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
    int target = 2;

    // When
    int result = Solution.binarySearchR(list, target, 0, list.length - 1);

    // Then
    assertEquals(1, result);
  }
}
