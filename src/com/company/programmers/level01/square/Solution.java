package com.company.programmers.level01.square;

import java.util.HashMap;

public class Solution {
  public int[] solution(int[][] v) {
    int[] answer = {};

    System.out.println("Hello Java");

    HashMap<Integer, Integer> xDic = new HashMap<>();
    HashMap<Integer, Integer> yDic = new HashMap<>();

    for (int[] pos : v) {
      int xPos = pos[0];
      int yPos = pos[1];
      Integer xPosCount = xDic.getOrDefault(xPos, 0);
      Integer yPosCount = xDic.getOrDefault(yPos, 0);
      xDic.put(xPos, ++xPosCount);
      yDic.put(xPos, ++yPosCount);
    }

    int x = 0;
    int y = 0;
    for( Integer key : xDic.keySet() ){
      if(xDic.get(key) == 1) x = key;
    }

    for( Integer key : yDic.keySet() ){
      if(yDic.get(key) == 1) y = key;
    }
    answer[0] = x;
    answer[1] = y;

    return answer;
  }
}
