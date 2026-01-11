package com.company.leetcode.q22_GenerateParentheses;

import static org.junit.jupiter.api.Assertions.*;

import java.util.List;
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
    List<String> strings = main.generateParenthesis(1);
    Assertions.assertThat(strings).containsExactlyInAnyOrder("()");
  }

  @Test
  void 테스트2() {
    List<String> strings = main.generateParenthesis(3);
    Assertions.assertThat(strings)
        .containsExactlyInAnyOrder("((()))", "(()())", "(())()", "()(())", "()()()");
  }
}
