package com.company.part02.chapter05dfsbfs.q4.maze;

import java.util.LinkedList;
import java.util.Queue;

public class Solution {

  public int solution(int N, int M, int[][] map) {
    int result = dfs(0, 0, N, M, map, 100);
    System.out.println(result);
    return result;
  }

  public int dfs(int initX, int initY, int N, int M, int[][] map, int result) {
    Queue<int[]> queue = new LinkedList<>();
    int[] pos = {initX, initY};
    queue.offer(pos);

    // 상 하 좌 우
    int[] dx = {-1, 1, 0, 0};
    int[] dy = {0, 0, -1, 1};

    while (!queue.isEmpty()) {

      int[] currentPos = queue.poll();
      int x = currentPos[0];
      int y = currentPos[1];

      for (int i = 0; i < 4; i++) {

        int nx = x + dx[i];
        int ny = y + dy[i];

        // 미로 찾기 공간 확인
        if (nx < 0 || nx >= N || ny < 0 || ny >= M) {
          continue;
        }

        // 벽인 경우
        if (map[nx][ny] == 0) {
          continue;
        }

        if (map[nx][ny] == 1) {
          map[nx][ny] = map[x][y] + 1;
          queue.offer(new int[] {nx, ny});
        }
      }
    }

    return map[N - 1][M - 1];
  }
}
