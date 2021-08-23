package com.company.part02.chapter03greedy.q4untilbecome1;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.api.TestInstance.Lifecycle;

@TestInstance(Lifecycle.PER_CLASS)
@DisplayName("그리디 - 문제4번 : 1이 될때 까지")
class SolutionTest {

  Solution main;

  @BeforeAll
  void beforeAllTests() {
    main = new Solution();
  }

  @Test
  void 예시1_테스트() {

    // Given
    int N = 17;
    int K = 4;

    // When
    int result = main.solution(N, K);

    // Then
    assertEquals(3, result);
  }

  @Test
  void 예시2_테스트() {

    // Given
    int N = 25;
    int K = 5;

    // When
    int result = main.solution(N, K);

    // Then
    assertEquals(2, result);
  }
}
