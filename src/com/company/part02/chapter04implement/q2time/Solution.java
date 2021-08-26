package com.company.part02.chapter04implement.q2time;

public class Solution {

  /**
   * <b>구현 Part - Q2 : 시각</b><br>
   * <br>
   * 00:00:00 ~ N:59:59의 시간 사이에<br>
   * 3이 하나라도 포함되어 있는 수를 계산하라<br>
   *
   * @param N 시간
   * @return
   */
  public int solution(int N) {

    String TARGET = "3";
    int result = 0;

    String time; // 각각의 시분초

    for (int i = 0; i <= N; i++) {
      for (int j = 0; j <= 59; j++) {
        for (int k = 0; k <= 59; k++) {
          time = "";
          time += "" + i;
          time += "" + j;
          time += "" + k;

          if (time.contains(TARGET)) {
            result++;
          }
        }
      }
    }

    return result;
  }
}
