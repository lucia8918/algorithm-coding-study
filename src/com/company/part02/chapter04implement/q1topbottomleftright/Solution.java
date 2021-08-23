package com.company.part02.chapter04implement.q1topbottomleftright;

public class Solution {

  /**
   * <b>구현 Part - Q1 : 상하좌우</b><br>
   * <br>
   * N * N의 정사각형에서 L,R,U,D 문자를 통해 여행가가 이동한다<br>
   * 최종적으로 여행자의 이동 위치를 출력하라.<br>
   * 단) 시작위치는 1,1이고, 막힌 길은 무시
   *
   * @param N 정사각형 크기
   * @param commands 이동 명령어 리스트
   * @return
   */
  public String solution(int N, String[] commands) {

    // 우선 0, 0 부터 시작한다고 가정, 추후에 1,1 시작한다고 가정하여 변환 처리
    int currentPosX = 0;
    int currentPosY = 0;

    // LEFT : Y-1
    // RIGHT : Y+1
    // UP : X-1
    // DOWN : X+1
    for (int i = 0; i < commands.length; i++) {

      if (commands[i] == "L" && currentPosY > 0) {
        currentPosY--;
      } else if (commands[i] == "R" && currentPosY < N - 1) {
        currentPosY++;
      } else if (commands[i] == "U" && currentPosX > 0) {
        currentPosX--;
      } else if (commands[i] == "D" && currentPosX < N - 1) {
        currentPosX++;
      }
    }

    // 0,0 -> 1,1 변환
    currentPosX++;
    currentPosY++;

    return currentPosX + " " + currentPosY;
  }
}
