package com.company.part02.chapter05dfsbfs.q4.maze;

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
    int N = 3;
    int M = 3;
    int[][] map = {{1, 1, 0}, {0, 1, 0}, {0, 1, 1}};

    // When
    int result = main.solution(N, M, map);

    // Then
    assertEquals(5, result);
  }

  @Test
  void 예제2_테스트() {

    // Given
    int N = 5;
    int M = 6;
    int[][] map = {
      {1, 0, 1, 0, 1, 0}, {1, 1, 1, 1, 1, 1}, {0, 0, 0, 0, 0, 1}, {1, 1, 1, 1, 1, 1}, {1, 1, 1, 1, 1, 1}
    };

    // When
    int result = main.solution(N, M, map);

    // Then
    assertEquals(10, result);
  }
}
