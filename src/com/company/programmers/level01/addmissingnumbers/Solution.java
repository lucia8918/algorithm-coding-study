package com.company.programmers.level01.addmissingnumbers;

import java.util.HashSet;
import java.util.Set;

/**
 * 프로그래머스 - LV1 없는 숫자 더하기<br>
 * https://programmers.co.kr/learn/courses/30/lessons/86051
 */
public class Solution {

  public int solution(int[] numbers) {

    int sum = 45;

    for (int number : numbers) {
      sum -= number;
    }
    return sum;
  }

  public int solution2(int[] numbers) {
    int answer = 0;

    Set<Integer> dic = new HashSet<>();

    for (int number : numbers) {
      dic.add(number);
    }

    for (int i = 0; i < 10; i++) {
      if (!dic.contains(i)) answer += i;
    }

    return answer;
  }
}
