package com.company.leetcode.addTwoNumbers;

public class Solution {

  public static class ListNode {
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

  public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
    ListNode dummyHead = new ListNode(0); // 결과 리스트의 더미 노드
    ListNode current = dummyHead; // 현재 노드
    int carry = 0; // 올림값

    while (l1 != null || l2 != null || carry != 0) {
      int sum = carry; // 이전 올림값 추가

      if (l1 != null) {
        sum += l1.val;
        l1 = l1.next;
      }
      if (l2 != null) {
        sum += l2.val;
        l2 = l2.next;
      }

      carry = sum / 10; // 10 이상이면 올림 발생
      current.next = new ListNode(sum % 10); // 1의 자리 저장
      current = current.next; // 다음 노드 이동
    }

    return dummyHead.next; // 더미 노드 제외하고 반환
  }

  // 연결 리스트 출력 함수
  public static void printList(ListNode node) {
    while (node != null) {
      System.out.print(node.val);
      if (node.next != null) System.out.print(" -> ");
      node = node.next;
    }
    System.out.println();
  }
}
