package com.company.part02.chapter04implement.q1topbottomleftright;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.api.TestInstance.Lifecycle;

@TestInstance(Lifecycle.PER_CLASS)
@DisplayName("구형 - 문제1번 : 상하좌우")
class SolutionTest {

  Solution main;

  @BeforeAll
  void beforeAllTests() {
    main = new Solution();
  }

  @Test
  void solution() {

    // Given
    int N = 5;
    String[] commands = {
      "R", "R", "R", "U", "D", "D",
    };

    // When
    String result = main.solution(N, commands);

    // Then
    assertEquals("3 4", result);
  }
}
