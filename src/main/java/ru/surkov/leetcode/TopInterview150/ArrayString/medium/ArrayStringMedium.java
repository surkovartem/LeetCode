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
      if (nums[i] == nums[i - 1]) {
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

  /**
   * 189.Rotate Array.Given an integer array nums, rotate the array to the right by k steps, where k
   * is non-negative.
   */
  public void rotate(int[] nums, int k) {
    k %= nums.length;
    reverse(nums, 0, nums.length - 1);
    reverse(nums, 0, k - 1);
    reverse(nums, k, nums.length - 1);
  }

  private void reverse(int[] nums, int left, int right) {
    while (left < right) {
      int temp = nums[left];
      nums[left] = nums[right];
      nums[right] = temp;
      left++;
      right--;
    }
  }
}