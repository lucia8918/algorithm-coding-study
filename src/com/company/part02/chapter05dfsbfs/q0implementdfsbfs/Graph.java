package com.company.part02.chapter05dfsbfs.q0implementdfsbfs;

import java.util.ArrayList;
import java.util.List;

public class Graph {
  class Node {
    int data;

    // 인접 노드
    List<Node> adjacent;

    boolean marked;

    public Node(int data) {
      this.data = data;
      this.marked = false;
      this.adjacent = new ArrayList<>();
    }
  }

  Node[] nodes;

  Graph(int size) {
    nodes = new Node[size];

    for (int i = 0; i < size; i++) {
      nodes[i] = new Node(i);
    }
  }

  void addEdge(int idx1, int idx2) {
    Node n1 = nodes[idx1];
    Node n2 = nodes[idx2];

    // 인접 체크 후, 없으면 관계 추가
    if (!n1.adjacent.contains(n2)) {
      n1.adjacent.add(n2);
    }

    if (!n2.adjacent.contains(n1)) {
      n2.adjacent.add(n1);
    }
  }
}
