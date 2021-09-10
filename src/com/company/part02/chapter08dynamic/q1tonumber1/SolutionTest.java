package com.company.part02.chapter08dynamic.q1tonumber1;

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
    int X = 6;

    // When
    int result = main.solution(X);

    // Then
    assertEquals(2, result);
  }

  @Test
  void 예제2_테스트() {
    // Given
    int X = 26;

    // When
    int result = main.solution(X);

    // Then
    assertEquals(3, result);
  }
}
