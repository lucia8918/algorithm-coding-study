package com.company.part02.chapter05dfsbfs.q0factorial;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

@DisplayName("재귀함수 - 펙토리얼 테스트")
class SolutionTest {

  Solution main;

  @BeforeEach
  void setUp() {
    main = new Solution();
  }

  @Test
  void factorial_테스트() {

    // Given
    int N = 5;

    // When
    int result = main.factorial(N);

    // Then
    assertEquals(120, result);
  }

  @Test
  void factorial_재귀함수_테스트() {

    // Given
    int N = 5;

    // When
    int result = main.factorialR(N);

    // Then
    assertEquals(120, result);
  }
}
