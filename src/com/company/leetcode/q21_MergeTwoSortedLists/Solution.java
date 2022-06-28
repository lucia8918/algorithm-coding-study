package com.company.leetcode.q21_MergeTwoSortedLists;

public class Solution {

  public class ListNode {
    int val;
    ListNode next;

    ListNode() {}

    ListNode(int val) {
      this.val = val;
    }

    ListNode(int val, ListNode next) {
      this.val = val;
      this.next = next;
    }
  }

  /*
   * 2개의 링크드 리스트를 1개의 정렬된 링크드 리스트로 합치기
   *
   */
  public ListNode mergeTwoLists(ListNode list1, ListNode list2) {

    ListNode result = null;
    ListNode current = null;

    while (list1 != null || list2 != null) {

      // l1 이 작은 경우
      if (list2 == null || (list1 != null && list1.val < list2.val)) {

        if (result == null) {
          result = list1;
          current = list1;
          list1 = list1.next;

        } else {
          current.next = list1;
          current = list1;
          list1 = list1.next;
        }

      } else {
        if (result == null) {
          result = list2;
          current = list2;
          list2 = list2.next;

        } else {
          current.next = list2;
          current = list2;
          list2 = list2.next;
        }
      }
    }
    return result;
  }
}
