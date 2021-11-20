package com.company.programmers.level01.numbermix;

/**
 * 프로그래머스 - LV1 숫자 문자열과 영단어<br>
 * https://programmers.co.kr/learn/courses/30/lessons/81301
 */
public class Solution {

  public static int solution(String s) {
    String result = "";
    String temp = "";
    for (int i = 0; i < s.length(); i++) {
      char c = s.charAt(i);
      int value = c - '0';

      if (!temp.equals("")) {
        int resultNumber = wordToInt(temp);
        if (resultNumber != -1) {
          result += resultNumber;
          temp = "";
        }
      }

      if (value >= 0 && value <= 9) {
        result += c;
        temp = "";
      } else {
        temp += c;
      }
    }

    if (!temp.equals("")) result += wordToInt(temp);
    return Integer.parseInt(result);
  }

  public static int wordToInt(String word) {
    switch (word) {
      case "zero":
        return 0;
      case "one":
        return 1;
      case "two":
        return 2;
      case "three":
        return 3;
      case "four":
        return 4;
      case "five":
        return 5;
      case "six":
        return 6;
      case "seven":
        return 7;
      case "eight":
        return 8;
      case "nine":
        return 9;
      default:
        return -1;
    }
  }
}
