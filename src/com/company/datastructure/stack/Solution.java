package com.company.datastructure.stack;

import java.util.Stack;

public class Solution {

  public static void main(String[] args) {
    Solution main = new Solution();
    main.solution();
  }

  public void solution() {
    Stack<Integer> stack = new Stack<>();

    stack.push(5);
    stack.push(2);
    stack.push(3);
    stack.push(7);
    stack.pop();
    stack.push(1);
    stack.push(4);
    stack.pop();

    while (!stack.empty()) {
      System.out.print(stack.peek() + " ");
      stack.pop();
    }
  }
}
