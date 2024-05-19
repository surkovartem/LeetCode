package ru.surkov.leetcode.TopInterview150.ArrayString.easy;

import java.util.Arrays;

public class ArrayString {

  /**
   * 88.Merge Sorted Array. The final sorted array should not be returned by the function, but
   * instead be stored inside the array nums1. To accommodate this, nums1 has a length of m + n,
   * where the first m elements denote the elements that should be merged, and the last n elements
   * are set to 0 and should be ignored. nums2 has a length of n.
   */
  public void merge(int[] nums1, int m, int[] nums2, int n) {
    for (int j = 0, i = m; j < n; j++) {
      nums1[i] = nums2[j];
      i++;
    }
    Arrays.sort(nums1);
  }
}
