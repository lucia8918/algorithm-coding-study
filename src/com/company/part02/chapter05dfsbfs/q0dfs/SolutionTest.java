package com.company.part02.chapter05dfsbfs.q0dfs;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class SolutionTest {
  Solution main;
  Graph graph;

  @BeforeEach
  void setUp() {
    main = new Solution(10);

    graph = main.graph;

    graph.addEdge(1, 2);
    graph.addEdge(1, 3);
    graph.addEdge(1, 8);
    graph.addEdge(2, 7);
    graph.addEdge(3, 4);
    graph.addEdge(3, 5);
    graph.addEdge(4, 5);
    graph.addEdge(6, 7);
    graph.addEdge(7, 8);
  }

  @Test
  void dfs_스택구현_테스트() {

    main.dfs(1);
  }

  @Test
  void dfs_리컬시브구현_테스트() {

    main.dfsR(graph.nodes[1]);
  }
}
