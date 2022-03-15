package com.company.programmers.level01.failurerate;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {

  @Test
  void 테스트() {

    Solution main = new Solution();
    int N = 5;
    int[] stages = {2, 1, 2, 6, 2, 4, 3, 3};

    int[] result = main.solution(N, stages);

    assertThat(result).isEqualTo(new int[] {3, 4, 2, 1, 5});
  }

  @Test
  void 테스트2() {

    Solution main = new Solution();
    int N = 4;
    int[] stages = {1,1,1,1,1};

    int[] result = main.solution(N, stages);

    assertThat(result).isEqualTo(new int[] {4, 1, 2, 3});
  }
}
