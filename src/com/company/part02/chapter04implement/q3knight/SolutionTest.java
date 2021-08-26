package com.company.part02.chapter04implement.q3knight;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.api.TestInstance.Lifecycle;

@TestInstance(Lifecycle.PER_CLASS)
@DisplayName("구현 - 문제3번 : 왕실의 나이트")
class SolutionTest {

  Solution main;

  @BeforeAll
  void beforeAllTests() {
    main = new Solution();
  }

  @Test
  void 예시1_테스트() {

    // Given
    // a1 case
    int rowNumber = 0;
    int colNumber = 0;

    // When
    int result = main.solution(rowNumber, colNumber);
    int result2 = main.solution2(rowNumber, colNumber);

    assertEquals(2, result);
    assertEquals(2, result2);
  }

  @Test
  void 예시2_테스트() {

    // Given
    // c2 case
    int rowNumber = 1;
    int colNumber = 2;

    // When
    int result = main.solution(rowNumber, colNumber);
    int result2 = main.solution2(rowNumber, colNumber);

    assertEquals(6, result);
    assertEquals(6, result2);
  }
}
