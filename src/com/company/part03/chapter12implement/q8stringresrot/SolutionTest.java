package com.company.part03.chapter12implement.q8stringresrot;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class SolutionTest {

  @Test
  void 예제_테스트() {
    Solution solution = new Solution();
    String result = solution.solution("K1KA5CB7");
    Assertions.assertThat(result).isEqualTo("ABCKK13");
  }
}
