package com.company.part03.chapter03greedy.q3reverseString;

public class Solution {

  /**
   * 파트3 기출문제 - 그리디<br>
   * Q3 - 문자열 뒤집기<br>
   * 0, 1로 이루어진 문자열 S를 가지고 모든 숫자를 전부 같게 만들려고한다.<br>
   * 뒤집는 것은 1을0, 0을1로 바꾸는 것을 의미 한다.
   *
   * @param str
   * @return
   */
  public int solution(String str) {

    int result = 0;
    int totalZeroCount = 0;
    int totalOneCount = 0;
    String inverseTargetNumber = "0";

    // 각각의 개수를 구하고
    String[] items = str.split("");

    for (String item : items) {
      if (item.equals("0")) {
        totalZeroCount++;
      } else {
        totalOneCount++;
      }
    }

    // 그 중에서 개수가 적은 값을 뒤집는다.
    if (totalZeroCount > totalOneCount) {
      inverseTargetNumber = "1";
    }

    System.out.println("inverseTargetNumber: " + inverseTargetNumber);

    for (int i = 0; i < items.length; i++) {
      String currentNumber = items[i];
      int pos = 0;

      // 타겟이 아니면
      if (!currentNumber.equals(inverseTargetNumber)) {
        continue;

        // 타겟이면
      } else {

        // 포지션 다음 부터 연속되는 수까지 확인
        for (int j = i; j < items.length; j++) {
          if (items[j].equals(inverseTargetNumber)) {
            pos = j;
            continue;
          } else {
            break;
          }
        }
        result++;
        if (i != pos) {
          i = ++pos;
        }
      }
    }

    return result;
  }
}
