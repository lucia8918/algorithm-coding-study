package com.company.part02.chapter03greedy.retry1.q3;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class SolutionTest {

  @Test
  void 테스트() {
    int[][] cards = {{3, 1, 2}, {4, 1, 4}, {2, 2, 2}};

    Solution solution = new Solution();

    int result = solution.solution(cards);

    Assertions.assertThat(result).isEqualTo(2);
  }
}
