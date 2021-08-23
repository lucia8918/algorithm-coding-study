package com.company.part02.chapter03greedy.q2bignumber;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.api.TestInstance.Lifecycle;

@TestInstance(Lifecycle.PER_CLASS)
@DisplayName("그리디 - 문제2번 : 큰수의 법칙")
class SolutionTest {

  Solution main;

  @BeforeAll
  void beforeAllTests() {
    main = new Solution();
  }

  @Test
  void 예시1_테스트() {

    // Given
    int N = 5;
    int M = 8;
    int K = 3;
    int items[] = {2, 4, 5, 4, 6};

    // When
    int result = main.solution(N, M, K, items);

    assertEquals(46, result);
  }

  @Test
  void 예시2_테스트() {

    // Given
    int condition[] = {5, 7, 2};
    int N = 5;
    int M = 7;
    int K = 2;

    int items[] = {3, 4, 3, 4, 3};

    // When
    int result = main.solution(N, M, K, items);

    assertEquals(28, result);
  }
}
