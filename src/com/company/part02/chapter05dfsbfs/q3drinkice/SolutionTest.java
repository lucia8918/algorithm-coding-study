package com.company.part02.chapter05dfsbfs.q3drinkice;

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
  void 예시1_테스트() {

    // Given
    int N = 4;
    int M = 5;
    int[][] map = {{0, 0, 1, 1, 0}, {0, 0, 0, 1, 1}, {1, 1, 1, 1, 1}, {0, 0, 0, 0, 0}};

    // When
    int result = main.solution(N, M, map);

    // Then
    assertEquals(3, result);
  }

  @Test
  void 예시2_테스트() {

    // Given
    int N = 3;
    int M = 3;
    int[][] map = {{0, 0, 1}, {0, 1, 0}, {1, 0, 1}};

    // When
    int result = main.solution(N, M, map);

    // Then
    assertEquals(3, result);
  }
}
