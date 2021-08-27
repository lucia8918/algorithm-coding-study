package com.company.part02.chapter03greedy.q1coin;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

@DisplayName("그리디 - 문제1번 : 거스름 돈")
class SolutionTest {

  Solution main;

  @BeforeEach
  void setUp() {
    main = new Solution();
  }

  @Test
  void 예시1_테스트() {

    // Given
    int[] coins = {500, 100, 50, 10};
    int amount = 1260;

    // When
    int result = main.solution(amount, coins);

    // Then
    assertEquals(6, result);
  }
}
