package ru.surkov.leetcode.TopInterview150.ArrayString.easy;

import java.util.Arrays;

/**
 * Задачи сложности easy, Top Interview 150 (Leetcode).
 */
public class ArrayStringEasy {

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

  /**
   * 27.Remove Element. Given an integer array nums and an integer val, remove all occurrences of
   * val in nums in-place. The order of the elements may be changed. Then return the number of
   * elements in nums which are not equal to val.
   */
  public int removeElement(int[] nums, int val) {
    int k = 0;
    for (int i = 0; i < nums.length; i++) {
      if (nums[i] != val) {
        int temp = nums[k];
        nums[k] = nums[i];
        nums[i] = temp;
        k++;
      }
    }
    return k;
  }

  /**
   * 26.Remove Duplicate from Sorted Array. Given an integer array nums sorted in non-decreasing
   * order, remove the duplicates in-place such that each unique element appears only once. The
   * relative order of the elements should be kept the same. Then return the number of unique
   * elements in nums.
   */
  public int removeDuplicates(int[] nums) {
    int k = 1;
    for (int i = 1; i < nums.length; i++) {
      if (nums[i] != nums[i - 1]) {
        nums[k] = nums[i];
        k++;
      }
    }
    return k;
  }
}
