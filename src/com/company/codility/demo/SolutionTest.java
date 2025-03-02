package com.company.codility.demo;

import static org.junit.jupiter.api.Assertions.*;

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
  void 테스트() {
    int[] input = {1, 2, 3};
    Assertions.assertThat(main.solution(input)).isEqualTo(4);
  }

  @Test
  void 테스트2() {
    int[] input = {1, 3, 6, 4, 1, 2};
    Assertions.assertThat(main.solution(input)).isEqualTo(5);
  }

  @Test
  void 테스트3() {
    int[] input = {-1, -3};
    Assertions.assertThat(main.solution(input)).isEqualTo(1);
  }
}
