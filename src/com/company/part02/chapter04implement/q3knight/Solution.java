package com.company.part02.chapter04implement.q3knight;

public class Solution {

  /**
   * <b>구현 Part - Q3 : 왕실의 나이트</b><br>
   * 기사는 아래 방법으로 이동이 가능하다<br>
   * 방법1) 수평으로 2칸 이동 후 수직으로 1칸 이동 하기<br>
   * 방법2) 수직으로 2칸 이동 후 수평으로 1칸 이동 하기<br>
   * 8x8 크기의 정원에서 특정 위치에서 이동 가능한 경우의 수를 모두 구하시오
   *
   * @param rowNumber
   * @param colNumber
   * @return
   */
  public int solution(int rowNumber, int colNumber) {
    int result = 0;

    // 수평 왼쪽
    if (colNumber > 1) {

      if (rowNumber != 0) result++; // 상단 수직 이동
      if (rowNumber != 7) result++; // 하단단 수직 이동
    }

    // 수평 오른쪽
    if (colNumber < 5) {

      if (rowNumber != 0) result++; // 상단 수직 이동
      if (rowNumber != 6) result++; // 하단단 수직 이동
    }

    // 수직 위로 가능 확인
    if (rowNumber > 1) {

      if (colNumber != 0) result++; // 상단 수직 이동
      if (colNumber != 6) result++; // 하단단 수직 이동
    }

    // 수직 아래로 가능 확인
    if (rowNumber < 5) {

      if (colNumber != 0) result++; // 상단 수직 이동
      if (colNumber != 6) result++; // 하단단 수직 이동
    }

    return result;
  }

  /**
   * 이동 명령어 어레이를 통한 처리
   *
   * @param rowNumber
   * @param colNumber
   * @return
   */
  public int solution2(int rowNumber, int colNumber) {

    // row, col
    int[][] commands = {{2, 1}, {2, -1}, {-2, 1}, {-2, -1}, {1, 2}, {-1, 2}, {1, -2}, {-1, -2}};

    int result = 0;
    int currentRowPos;
    int currentColPos;
    for (int i = 0; i < commands.length; i++) {
      currentRowPos = rowNumber + commands[i][0];
      currentColPos = colNumber + commands[i][1];

      if ((currentRowPos >= 0 && currentRowPos <= 6) && (currentColPos >= 0 && currentColPos <= 6))
        result++;
    }
    return result;
  }
}
