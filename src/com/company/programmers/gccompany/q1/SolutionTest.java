package com.company.programmers.gccompany.q1;

import static org.junit.jupiter.api.Assertions.*;

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
    String[] records = {
      "2020-02-02 uid141 pid141",
      "2020-02-03 uid141 pid32",
      "2020-02-04 uid32 pid32",
      "2020-02-05 uid32 pid141"
    };
    int k = 10;
    String date = "2020-02-05";
    String[] solution = main.solution(records, k, date);

    for (String s : solution) {
      System.out.println(s);
    }
  }

  @Test
  void 테스트2() {
    String[] records = {
      "2020-02-02 uid1 pid1",
      "2020-02-26 uid1 pid1",
      "2020-02-26 uid2 pid1",
      "2020-02-27 uid3 pid2",
      "2020-02-28 uid4 pid2",
      "2020-02-29 uid3 pid3",
      "2020-03-01 uid4 pid3",
      "2020-03-03 uid1 pid1",
      "2020-03-04 uid2 pid1",
      "2020-03-05 uid3 pid2",
      "2020-03-05 uid3 pid3",
      "2020-03-05 uid3 pid3",
      "2020-03-06 uid1 pid4"
    };
    int k = 10;
    String date = "2020-03-05";
    String[] solution = main.solution(records, k, date);

    for (String s : solution) {
      System.out.println(s);
    }
  }

  @Test
  void 테스트3() {
    String[] records = {"2020-01-01 uid1000 pid5000"};
    int k = 10;
    String date = "2020-01-11";
    String[] solution = main.solution(records, k, date);

    for (String s : solution) {
      System.out.println(s);
    }
  }
}
