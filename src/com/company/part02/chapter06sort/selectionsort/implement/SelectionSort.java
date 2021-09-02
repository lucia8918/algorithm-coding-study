package com.company.part02.chapter06sort.selectionsort.implement;

import com.company.common.CommonUtils;

public class SelectionSort {

  public void sort(int[] arr) {

    for (int i = 0; i < arr.length; i++) {

      int minIdx = i;
      for (int j = i + 1; j < arr.length; j++) {
        if (arr[minIdx] > arr[j]) {
          minIdx = j;
        }
      }
      CommonUtils.swap(i, minIdx, arr);
    }

    CommonUtils.show(arr);
  }
}
