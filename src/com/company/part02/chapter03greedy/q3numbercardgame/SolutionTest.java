package com.company.part02.chapter03greedy.q3numbercardgame;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.api.TestInstance.Lifecycle;

@TestInstance(Lifecycle.PER_CLASS)
@DisplayName("그리디 - 문제3번 : 숫자 카드 게임 테스트")
class SolutionTest {

  Solution main;

  @BeforeAll
  void beforeAllTests() {
    main = new Solution();
  }

  @Test
  void 예시1_테스트() {

    // Given
    int N = 3;
    int M = 3;
    int[][] cards = {{3, 1, 2}, {4, 1, 4}, {2, 2, 2}};

    // When
    int result = main.solution(N, M, cards);

    // Then
    assertEquals(2, result);
  }

  @Test
  void 예시2_테스트() {

    // Given
    int N = 2;
    int M = 4;
    int[][] cards = {{7, 3, 1, 8}, {3, 3, 3, 4}};

    // When
    int result = main.solution(N, M, cards);

    // Then
    assertEquals(3, result);
  }
}
