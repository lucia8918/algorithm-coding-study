package com.company.common;

public class CommonUtils {

  public static void swap(int i, int j, int[] arr) {
    int temp = arr[i];
    arr[i] = arr[j];
    arr[j] = temp;
  }

  public static void show(int[] arr) {
    for (int value : arr) {
      System.out.print(value + " ");
    }
  }
}
