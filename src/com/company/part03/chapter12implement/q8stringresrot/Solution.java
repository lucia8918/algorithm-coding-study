package com.company.part03.chapter12implement.q8stringresrot;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Solution {

  // 문자열 S 가 주어진다
  // 길이는 1<=S<=10000
  // 알파벳 오름차순 정렬 후 숫자(0~9)의 합을 붙여서 노출
  public String solution(String S) {

    List<Character> alpa = new ArrayList<>();
    int numericSum = 0;
    String result = "";

    for (int i = 0; i < S.length(); i++) {

      if (S.charAt(i) >= 'A' && S.charAt(i) <= 'Z') {
        alpa.add(S.charAt(i));
      } else {
        numericSum += Character.getNumericValue(S.charAt(i));
      }
    }

    for (Character character : alpa.stream().sorted().collect(Collectors.toList())) {
      result += character;
    }

    return result + numericSum;
  }
}
