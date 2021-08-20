package com.company.part02.chapter03greedy.q2bignumber;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class SolutionTest {

  @Test
  void 테스트() {

    // Given
    int condition[] = {5, 8, 3};
    int items[] = {2, 4, 5, 4, 6};

    Solution solution = new Solution();

    // When
    int result = solution.solution(condition, items);

    assertEquals(result, 46);
  }

  @Test
  void 테스트2() {

    // Given
    int condition[] = {5, 7, 2};
    int items[] = {3, 4, 3, 4, 3};

    Solution solution = new Solution();

    // When
    int result = solution.solution(condition, items);

    assertEquals(result, 28);
  }
}
