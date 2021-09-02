package com.company.part02.chapter06sort.selectionsort.implement;

import com.company.common.CommonUtils;

/**
 * 삽입 정렬 O(N^2)<br>
 * 첫번째 인자는 정렬이 되었다고 가정하고, <br>
 * 두번째 인자 부터 왼쪽을 차례대로 비교하며, <br>
 * 자신이 크면 멈추고<br>
 * 자신이 작으면 서로 위치 변경<br>
 * 이 작업을 0번 인덱스 까지 수행<br>
 */
public class InsertionSort {

  public void sort(int[] arr) {

    for (int i = 1; i < arr.length; i++) {

      for (int j = i; j > 0; j--) {
        // 본인 보다 작으면
        if (arr[j] < arr[j - 1]) CommonUtils.swap(j, j - 1, arr);
        else break;
      }
    }

    CommonUtils.show(arr);
  }
}
