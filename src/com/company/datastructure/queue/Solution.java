package com.company.datastructure.queue;

import java.util.LinkedList;
import java.util.Queue;

public class Solution {
  public static void main(String[] args) {
    Solution solution = new Solution();
    solution.solution();
  }

  public void solution() {
    Queue<Integer> queue = new LinkedList<>();

    queue.offer(5);
    queue.offer(2);
    queue.offer(3);
    queue.offer(7);
    queue.poll();
    queue.offer(1);
    queue.offer(4);
    queue.poll();

    while (!queue.isEmpty()) {
      System.out.print(queue.poll() + " ");
    }
  }
}
