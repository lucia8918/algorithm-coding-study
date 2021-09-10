package com.company.part02.chapter08dynamic.q0fibonacci;

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
  void 피보나치_리컬시브_테스트() {
    // Given
    int N = 6;

    // When
    int result = main.fiboR(N);

    // Then
    assertEquals(8, result);
  }

  @Test
  void 피보나치_리컬시브_메모이제이션_테스트() {
    // Given
    int N = 6;

    // When
    int result = main.fiboRWithMemo(N);

    // Then
    assertEquals(8, result);
  }
}
