package com.company.part02.chapter05dfsbfs.q0implementdfsbfs;

import com.company.part02.chapter05dfsbfs.q0implementdfsbfs.Graph.Node;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Solution {

  Graph graph;

  Solution(int size) {
    graph = new Graph(size);
  }

  void dfs(int idx) {
    Node root = graph.nodes[idx];

    Stack<Node> stack = new Stack<>();

    // 스택에 넣고, 방문 처리
    stack.push(root);
    // System.out.println("push :: " + root.data);
    root.marked = true;

    while (!stack.empty()) {

      Node currentNode = stack.pop();
      System.out.print(currentNode.data + " ");
      // System.out.println("pop :: " + currentNode.data);

      // 해당 노드 인접 노드 순회
      for (Node node : currentNode.adjacent) {

        if (node.marked == false) {
          stack.push(node);
          // System.out.println("push :: " + node.data);
          node.marked = true;
        }
      }
    }
  }

  void dfsR(Node node) {
    if (node == null) return;
    node.marked = true;
    System.out.print(node.data + " ");

    for (Node n : node.adjacent) {
      if (n.marked == false) {
        dfsR(n);
      }
    }
  }

  void bfs(int idx) {

    Node root = graph.nodes[idx];

    Queue<Node> queue = new LinkedList<>();

    // Queue 에 시작 노드 추가
    queue.offer(root);

    // 루트 노드 방문 처리
    root.marked = true;

    // 큐가 비어 질때까지 순회
    while (!queue.isEmpty()) {

      // 큐에서 노드 하나를 꺼낸다.
      Node currentNode = queue.poll();
      System.out.print(currentNode.data + " ");

      // 해당 노드의 인접노드 중
      for (Node node : currentNode.adjacent) {

        // 방문 하지 않으 노드들 큐에 넣고, 방문 처리
        if (node.marked == false) {
          queue.offer(node);
          node.marked = true;
        }
      }
    }
  }
}
