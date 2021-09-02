package com.company.part02.chapter06sort.selectionsort.implement;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class SortTest {

  @Test
  void 선택정렬_테스트(){

    // Given
    SelectionSort selectionSort = new SelectionSort();
    int[] arr = {5, 4, 2, 1, 3};

    // When&Then
    selectionSort.sort(arr);

  }

  @Test
  void 삽입정렬_테스트(){

    // Given
    InsertionSort insertionSort = new InsertionSort();
    int[] arr = {5, 4, 2, 1, 3};

    // When&Then
    insertionSort.sort(arr);

  }

}