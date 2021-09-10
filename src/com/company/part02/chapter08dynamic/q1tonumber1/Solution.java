package com.company.part02.chapter08dynamic.q1tonumber1;

import java.util.Arrays;

public class Solution {

  /**
   * <b>다이나믹 프로그래밍 Part - Q1 : 1로 만들기</b><br>
   * <br>
   * 정수 X를 아래 연산을 사용하여 1을 만들 수 있는 최소 횟수를 구하라<br>
   * 정수 X가 주어질 때 정수 X에 사용할 수 있는 연산은 다음 4가지<br>
   * 1) X가 5로 나누어 떨어지면, 5로 나눈다.<br>
   * 2) X가 3로 나누어 떨어지면, 3로 나눈다.<br>
   * 3) X가 2로 나누어 떨어지면, 2로 나눈다.<br>
   * 4) X에서 1을 뺸다.<br>
   *
   * @param X 정수 X
   * @return 최소 연산 횟수
   */
  public int solution(int X) {

    // X=6 인 경우
    // F(6)
    // -1 case : F(5)
    // /2 case : F(3)
    // /3 case : F(2)
    // /5 case : 없음

    // F(5)
    // -1 case : F(4)
    // /2 case : 없음
    // /3 case : 없음
    // /5 case : F(5)

    // F(4)
    // -1 case : F(3)
    // /2 case : F(2)
    // /3 case : 없음
    // /5 case : 없음

    // F(3)
    // -1 case : F(2)
    // /2 case : 없음
    // /3 case : F(1)
    // /5 case : 없음

    // F(2)
    // -1 case : F(1)
    // /2 case : F(1)
    // /3 case : 없음
    // /5 case : 없음

    // 이렇게 큰 문제는 작은 문제의 답으로 해결이 가능하다.

    // 최솟값 저장용
    int[] d = new int[30001];

    for (int i = 2; i <= X; i++) {

      // -1 연산, 여기에 연산 횟수 +1
      d[i] = d[i - 1] + 1;

      // 5로 나누어 떨어지면
      if (i % 5 == 0) d[i] = Math.min(d[i], d[i / 5] + 1);

      // 3로 나누어 떨어지면
      if (i % 3 == 0) d[i] = Math.min(d[i], d[i / 3] + 1);

      // 2로 나누어 떨어지면
      if (i % 2 == 0) d[i] = Math.min(d[i], d[i / 2] + 1);
    }

    System.out.println(Arrays.toString(Arrays.copyOfRange(d, 1, X + 1)));

    return d[X];
  }
}
