package com.company.part02.chapter04implement.q2time;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

@DisplayName("구현 - 문제2번 : 시각")
class SolutionTest {

  @Test
  void 나머지연산테스트() {
    int number = 3;
    int result = number % 3;
    assertEquals(0, result);
  }

  @Test
  void solution() {
    Solution main = new Solution();

    // Given
    int N = 5;

    // When
    int result = main.solution(N);

    // Then
    assertEquals(11475, result);
  }
}
