package com.company.part02.chapter04implement.retry1.q1;

public class Solution {

  public int solution(int N, String command) {

    // 정사각형 맵
    int[][] map = new int[N][N];

    // 동 서 남 북
    int[] dx = {0, 0, 1, -1};
    int[] dy = {1, -1, 0, 0};

    // 현재 위치, 우선 0부터 시작한다
    int x = 0;
    int y = 0;

    // 이동할 위치
    int nx = 0;
    int ny = 0;
    String[] directions = command.split(" ");

    for (String direction : directions) {
      if (direction.equals("R")) {
        nx = x + dx[0];
        ny = y + dy[0];
      }

      if (direction.equals("L")) {
        nx = x + dx[1];
        ny = y + dy[1];
      }

      if (direction.equals("D")) {
        nx = x + dx[2];
        ny = y + dy[2];
      }

      if (direction.equals("U")) {
        nx = x + dx[3];
        ny = y + dy[3];
      }

      // 범위를 넘어간 경우
      if (nx < 0 || ny < 0 || nx > N - 1 || ny > N - 1) {
        continue;
      }

      x = nx;
      y = ny;
    }
    System.out.println("마지막 현재 위치 " + x + 1 + ", " + y + 1);

    return 0;
  }
}
