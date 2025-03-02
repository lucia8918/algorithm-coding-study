package com.company.leetcode.addTwoNumbers;

import static org.junit.jupiter.api.Assertions.*;

import com.company.leetcode.addTwoNumbers.Solution.ListNode;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class SolutionTest {

  Solution main;

  @BeforeEach
  void setUp() {
    main = new Solution();
  }

  @Test
  void 테스트() {

    ListNode l1_node3 = new ListNode(3, null);
    ListNode l1_node2 = new ListNode(4, l1_node3);
    ListNode l1_node1 = new ListNode(2, l1_node2);

    ListNode l2_node3 = new ListNode(4, null);
    ListNode l2_node2 = new ListNode(6, l2_node3);
    ListNode l2_node1 = new ListNode(5, l2_node2);

    main.addTwoNumbers(l1_node1, l2_node1);
  }

  @Test
  void 테스트_2() {

    ListNode l1_node1 = new ListNode(9, null);

    ListNode l2_node10 = new ListNode(9, null);
    ListNode l2_node9 = new ListNode(9, l2_node10);
    ListNode l2_node8 = new ListNode(9, l2_node9);
    ListNode l2_node7 = new ListNode(9, l2_node8);
    ListNode l2_node6 = new ListNode(9, l2_node7);

    ListNode l2_node5 = new ListNode(9, l2_node6);
    ListNode l2_node4 = new ListNode(9, l2_node5);
    ListNode l2_node3 = new ListNode(9, l2_node4);
    ListNode l2_node2 = new ListNode(9, l2_node3);
    ListNode l2_node1 = new ListNode(1, l2_node2);

    main.addTwoNumbers(l1_node1, l2_node1);
  }
}
