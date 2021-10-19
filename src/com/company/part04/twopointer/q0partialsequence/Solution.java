package com.company.part04.twopointer.q0partialsequence;

public class Solution {

  /**
   * 투포인트 문제<br>
   * 리스트에 순차적으로 접근해야 할때, 두개의 점을 이용해 위치를 기록하며 처리하는 알고리즘<br>
   * 합이 5인 부분 연속 수열의 개수 구하기<br>
   * Eg, 1, 2, 3, 2, 5 >> {2, 3}, {3, 2}, {5} 이렇게 3개 나온다.<br>
   * 시간 제한 O(N)으로 풀어라 <br>
   * https://www.youtube.com/watch?v=rI8NRQsAS_s&list=PLRx0vPvlEmdAZ6xXAUyBbLQa2-Ideakb-
   *
   * @param numbers 수열
   * @param M 합
   * @return
   */
  public static int solution(int[] numbers, int M) {

    int result = 0;

    // Step1 시작점, 끝점이 첫번째 원소를 가리키도록 한다.
    int start = 0;
    int end = 0;

    while (end < numbers.length) {

      int sum = sum(numbers, start, end);
      // Step2 현재 부분 합이 M 과 같다면, 카운트 증가
      if (sum == M) {
        System.out.println("start ::: " + start);
        System.out.println("end ::: " + end);

        result++;
      }

      // Step3 현재 부분 합이 M보다 작거나 같다면, end를 1증가. (즉, 값을 늘려야 하기에)
      if (sum <= M) {
        end++;
      }

      // Step4 현재 부분 합이 M보다 크다면, start를 1증가. (즉, 값을 줄여야 하기에)
      if (sum > M) {
        start++;
      }

      // 모든 경우를 확인 할때까지, Step2~4 반복
    }
    return result;
  }

  public static int sum(int[] numbers, int start, int end) {
    int sum = 0;
    for (int i = start; i <= end; i++) {
      sum += numbers[i];
    }
    return sum;
  }
}
