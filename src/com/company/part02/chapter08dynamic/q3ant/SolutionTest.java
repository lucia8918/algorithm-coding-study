package com.company.part02.chapter08dynamic.q3ant;

import static org.junit.jupiter.api.Assertions.*;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class SolutionTest {

  @Test
  void 예제1_테스트() {
    Solution main = new Solution();
    // Given
    int[] K = {1, 3, 1, 5};

    // When
    int result = main.solution(K);

    // Then
    Assertions.assertThat(result).isEqualTo(8);
  }
}
