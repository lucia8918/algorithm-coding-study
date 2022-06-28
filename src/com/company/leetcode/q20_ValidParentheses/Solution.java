package com.company.leetcode.q20_ValidParentheses;

import java.util.Stack;

public class Solution {

  public boolean isValid(String s) {
    char[] chars = s.toCharArray();
    Stack<Character> stack = new Stack<>();

    for (char c : chars) {
      if (c == '(' || c == '{' || c == '[') {
        stack.push(c);
      } else if (c == ')') {
        if (stack.size() == 0 || stack.pop() != '(') {
          return false;
        }
      } else if (c == '}') {
        if (stack.size() == 0 || stack.pop() != '{') {
          return false;
        }
      } else if (c == ']') {
        if (stack.size() == 0 || stack.pop() != '[') {
          return false;
        }
      } else {
        return false;
      }
    }

    return stack.size() <= 0;
  }
}
