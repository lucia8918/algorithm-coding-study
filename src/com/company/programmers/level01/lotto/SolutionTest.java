package com.company.programmers.level01.lotto;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {

  @Test
  void 테스트() {

    Solution solution = new Solution();

    // Given
    int[] lottos = {44, 1, 0, 0, 31, 25};
    int[] winNums = {31, 10, 45, 1, 6, 19};

    // When & Then
    assertThat(solution.solution(lottos, winNums)).isEqualTo(new int[] {3, 5});
  }

  @Test
  void 테스트2() {

    Solution solution = new Solution();

    // Given
    int[] lottos = {1, 2, 3, 4, 5, 6};
    int[] winNums = {7, 8, 9, 10, 11, 12};

    // When & Then
    assertThat(solution.solution(lottos, winNums)).isEqualTo(new int[] {6, 6});
  }
}
