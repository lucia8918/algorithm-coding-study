package com.company.part02.chapter05dfsbfs.q0dfs;

import com.company.part02.chapter05dfsbfs.q0dfs.Graph.Node;
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
}
