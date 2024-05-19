package ru.surkov.leetcode.TopInterview150.ArrayString.medium;

/**
 * Задачи сложности medium, Top Interview 150 (Leetcode).
 */
public class ArrayStringMedium {

  /**
   * 80.Remove Duplicate from Sorted Array 2. Given an integer array nums sorted in non-decreasing
   * order, remove some duplicates in-place such that each unique element appears at most twice. The
   * relative order of the elements should be kept the same.
   */
  public int removeDuplicates(int[] nums) {
    int index = 1;
    int repetitions = 1;

    for (int i = 1; i < nums.length; i++) {
      if (nums[i] == nums[i-1]) {
        repetitions++;
      } else {
        repetitions = 1;
      }

      if (repetitions <= 2) {
        nums[index] = nums[i];
        index++;
      }
    }
    return index;
  }
}