package com.company.part03.chapter03greedy.q4cantmakeamount;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class SolutionTest {

  Solution main;

  @BeforeEach
  void setUp() {
    main = new Solution();
  }

  @Test
  void 예제1_테스트() {

    // Given
    int[] N = {3, 2, 1, 1, 9};

    // When
    int result = main.solution(N);

    // Then
    assertEquals(8, result);
  }

  @Test
  void 예제2_테스트() {

    // Given
    int[] N = {3, 5, 7};

    // When
    int result = main.solution(N);

    // Then
    assertEquals(1, result);
  }
}
