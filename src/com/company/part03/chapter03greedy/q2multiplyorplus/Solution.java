package com.company.part03.chapter03greedy.q2multiplyorplus;

public class Solution {

  /**
   * 파트3 기출문제 - 그리디<br>
   * Q2 - 곱하기 혹은 더하기<br>
   * 곱하기 혹은 더하기 연산을 통해서 가장 큰수를 만들어라<br>
   * 연산은 왼쪽부터 수행된다.<br>
   * Eg, 02984 = 0+2, * 9 * 8 * 4 = 576이다<br>
   *
   * @param str
   * @return
   */
  public int solution(String str) {

    char[] numbers = str.toCharArray();
    int sum = 0;
    for (int i = 0; i < numbers.length; i++) {

      // char to int 2가지 방법
      // int value = numbers[i] - '0';
      int value = Character.getNumericValue(numbers[i]);

      if (sum == 0 || value == 0) {
        System.out.println("더하기 연산" + value);
        sum += value;
      } else {
        System.out.println("곱하기 연산" + value);
        sum *= value;
      }
    }
    return sum;
  }
}
