package com.company.programmers.level01.SpyClothe;

import java.util.HashMap;

public class Solution {

  public int solution(String[][] clothes) {
    int answer = 0;

    HashMap<String, String> dic = new HashMap<>();

    for (String[] clothe : clothes) {
      String name = clothe[0];
      String type = clothe[1];

      dic.put(type, name);
    }

    // 타입 종류
    int totalTypeCount = 0;

    // 총 아이템 개수
    int totalItemCount = 0;

    // 가능한 조합
    int availableCombineClothCase = 0;

    for (String key : dic.keySet()) {

      int itemCount = dic.get(key).length();

      if (totalItemCount == 0) availableCombineClothCase = itemCount;
      else availableCombineClothCase = availableCombineClothCase * itemCount;

      totalTypeCount++;
      totalItemCount += itemCount;
    }

    if (totalTypeCount == 1) return availableCombineClothCase;
    else return availableCombineClothCase + totalItemCount;
  }
}
