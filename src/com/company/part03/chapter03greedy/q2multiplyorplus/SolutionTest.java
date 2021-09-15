package com.company.part03.chapter03greedy.q2multiplyorplus;

import static org.junit.jupiter.api.Assertions.assertEquals;

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
    String str = "02984";

    int result = main.solution(str);

    assertEquals(576, result);
  }

  @Test
  void 예제2_테스트() {
    String str = "567";

    int result = main.solution(str);

    assertEquals(210, result);
  }

  @Test
  void 예제3_테스트() {
    String str = "05670";

    int result = main.solution(str);

    assertEquals(210, result);
  }
}
