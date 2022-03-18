package com.company.part03.chapter03greedy.q3reverseString;

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
    String str = "0001100";

    int result = main.solution(str);

    Assertions.assertThat(result).isEqualTo(1);
  }

  @Test
  void 예제2_테스트() {
    String str = "0001010";

    int result = main.solution(str);

    Assertions.assertThat(result).isEqualTo(2);
  }

  @Test
  void 예제3_테스트() {
    String str = "1001010";

    int result = main.solution(str);

    Assertions.assertThat(result).isEqualTo(3);
  }
}
