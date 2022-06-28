package com.company.leetcode.q461_HammingDistance;

public class Solution {

  /*
   * 비트 연산
   * a = 3 -> 11
   * b = 2 -> 10
   *
   * and : 두비트가 모두 1이면 1, 아니면 0
   * or : 두비트중 하나라도 1이면 1, 아니면 0
   * xor : 두비트가 다르면 1, 아니면 0
   *
   * a >> 1 = 01 : a의 모든 비트를 오른쪽으로 i만큼 밀고, 맨왼쪽을 0으로 채움
   * a << 1 = 10 : a의 모든 비트를 왼쪽으로 i만큼 밀고, 맨오른쪽을 0으로 채움
   *
   * A << B = A*(2^B)
   * A >> B = A/(2^B)
   * 해밍거리 : 같은 길이의 문자열 사이의 거리를 측정
   */
  public int hammingDistance(int x, int y) {

    int xor = x ^ y;
    int count = 0;

    for (int i = 0; i < 32; i++) {
      count += (xor >> i) & 1;
    }
    return count;
  }
}
