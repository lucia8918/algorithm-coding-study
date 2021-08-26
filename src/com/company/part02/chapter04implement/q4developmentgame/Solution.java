package com.company.part02.chapter04implement.q4developmentgame;

public class Solution {

  /**
   * <b>구현 Part - Q4 : 게임 개발</b><br>
   * @param N
   * @param M
   * @param position
   * @param maps
   * @return
   */
  public int solution(int N, int M, int[] position, int[][] maps) {

    int result = 1;

    // 방문 여부
    boolean[][] isVisit = new boolean[N][M];

    // 현재 위치
    int rowPos = position[0];
    int colPos = position[1];

    isVisit[rowPos][colPos] = true;

    // 이동 예정 위치
    int nextRowPos = 0;
    int nextColPos = 0;

    // 현재 방향
    // 0: 북쪽
    // 1: 동쪽
    // 2: 남쪽
    // 3: 서쪽
    int direction = position[2];

    // 명령어 모음, 북/동/남/서 으로 이동
    int[][] commands = {{-1, 0}, {0, 1}, {1, 0}, {0, -1}};
    int turnTime = 0;

    while (true) {

      // Step1 : 현재 기준으로 왼쪽 반시계 방향으로 갈곳을 정한다.
      if (direction == 0) {
        direction = 3;
      } else {
        direction--;
      }

      // Step2: 해당 방향으로 1칸 전진시에 가보지 않은 칸이 있으면 전진, 없으면 Step1로 이동
      nextRowPos = rowPos + commands[direction][0];
      nextColPos = colPos + commands[direction][1];
      if (isVisit[nextRowPos][nextColPos] == false && maps[nextRowPos][nextColPos] == 0) {
        rowPos = nextRowPos;
        colPos = nextColPos;
        isVisit[rowPos][colPos] = true;
        result++;
        turnTime = 0;
        continue;
      } else {
        turnTime++;
      }

      // 뒤로 가기 체크
      if (turnTime == 4) {
        nextRowPos = rowPos - commands[direction][0];
        nextColPos = colPos - commands[direction][1];

        // 뒤로 가기 처리
        if (maps[nextRowPos][nextColPos] == 0) {
          rowPos = nextRowPos;
          colPos = nextColPos;

          // 뒤에가 바다인경우 종료 처리
        } else {
          break;
        }
        // 반시계방향 이동수 초기화
        turnTime = 0;
      }
    }
    return result;
  }

  public boolean isValid(int N, int M, int row, int col) {
    if ((row >= 0 && row < N) && (col >= 0 && col < M)) return true;
    else return false;
  }
}
