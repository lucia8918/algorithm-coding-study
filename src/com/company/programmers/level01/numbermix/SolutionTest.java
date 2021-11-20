package com.company.programmers.level01.numbermix;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

class SolutionTest {

  @Test
  void 테스트() {
    assertThat(Solution.solution("one4seveneight")).isEqualTo(1478);
  }

  @Test
  void 테스트2() {
    assertThat(Solution.solution("23four5six7")).isEqualTo(234567);
  }
}
