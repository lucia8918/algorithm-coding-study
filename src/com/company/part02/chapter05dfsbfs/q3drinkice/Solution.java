package com.company.part02.chapter05dfsbfs.q3drinkice;

public class Solution {

  public int solution(int N, int M, int[][] map) {
    int result = 0;

    for (int i = 0; i < N; i++) {
      for (int j = 0; j < M; j++) {
        if (dfs(i, j, N, M, map)) {
          result++;
        }
      }
    }

    return result;
  }

  public boolean dfs(int x, int y, int N, int M, int[][] map) {

    // 주어진 범위 넘어가는 경우 즉시 종료
    if (x <= -1 || x >= N || y <= -1 || y >= M) return false;

    // 방문한적이 없으면
    if (map[x][y] == 0) {

      // 방문 처리
      map[x][y] = 1;

      // 상 체크
      dfs(x - 1, y, N, M, map);

      // 하 체크
      dfs(x + 1, y, N, M, map);

      // 좌 체크
      dfs(x, y - 1, N, M, map);

      // 우 체크
      dfs(x, y + 1, N, M, map);

      return true;
    }

    return false;
  }
}
