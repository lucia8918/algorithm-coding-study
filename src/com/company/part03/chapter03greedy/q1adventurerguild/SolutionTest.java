package com.company.part03.chapter03greedy.q1adventurerguild;

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
    int[] N = {2, 3, 1, 2, 2};

    // When
    int result = main.solution(N);

    // Then
    assertEquals(2, result);
  }
}
