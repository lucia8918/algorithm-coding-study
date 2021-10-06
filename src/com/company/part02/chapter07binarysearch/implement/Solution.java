package com.company.part02.chapter07binarysearch.implement;

public class Solution {

  protected static int binarySearchR(int[] list, int target, int start, int end) {

    if (start > end) return -1;

    int mid = (start + end) / 2;

    if (list[mid] == target) return mid;

    if (list[mid] > target) return binarySearchR(list, target, start, mid - 1);
    else return binarySearchR(list, target, mid + 1, end);
  }

  public static int binarySearch(int[] list, int target, int start, int end) {

    while (start <= end) {

      int mid = (start + end) / 2;

      if (list[mid] == target) return mid;
      else if (list[mid] > target) end = mid - 1;
      else start = mid + 1;
    }
    return -1;
  }
}
