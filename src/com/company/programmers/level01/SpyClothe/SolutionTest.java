package com.company.programmers.level01.SpyClothe;

import org.assertj.core.api.Assertions;
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
    String[][] clothes = {
      {"yellowhat", "headgear"}, {"bluesunglasses", "eyewear"}, {"green_turban", "headgear"}
    };

    // When
    int result = main.solution(clothes);

    // Then
    Assertions.assertThat(result).isEqualTo(5);
  }
}
