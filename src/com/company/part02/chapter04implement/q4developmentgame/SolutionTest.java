package com.company.part02.chapter04implement.q4developmentgame;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

@DisplayName("구현 - 문제4번 : 게임 개발")
class SolutionTest {

  Solution main;

  @BeforeEach
  void setUp() {
    main = new Solution();
  }

  @Test
  void 예제1_테스트() {

    // Given
    int N = 4;
    int M = 4;
    int[] pos = {1, 1, 0};
    int[][] maps = {{1, 1, 1, 1}, {1, 0, 0, 1}, {1, 1, 0, 1}, {1, 1, 1, 1}};

    // When
    int result = main.solution(N, M, pos, maps);

    // Then
    assertEquals(3, result);
  }

  @Test
  void 예제2_테스트() {

    // Given
    int N = 5;
    int M = 5;
    int[] pos = {1, 1, 0};
    int[][] maps = {
      {1, 1, 1, 11}, {1, 0, 0, 0, 1}, {1, 1, 0, 0, 1}, {1, 1, 1, 0, 1}, {1, 1, 1, 1, 1}
    };

    // When
    int result = main.solution(N, M, pos, maps);

    // Then
    assertEquals(6, result);
  }
}
