package ru.surkov.leetcode.TopInterview150.ArrayString.easy;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.DisplayName;

public class ArrayStringTest {

  ArrayString arrayString;

  @BeforeEach
  public void setup() {
    arrayString = new ArrayString();
  }

  @Nested
  @DisplayName("88. Merge Sorted Array.")
  class MergeSotredArray {

    @Test
    @DisplayName("Case 1")
    public void mergeSortedArrayCase1() {
      int[] nums1 = new int[]{1, 2, 3, 0, 0, 0};
      int[] nums2 = new int[]{2, 5, 6};
      int m = 3;
      int n = 3;

      arrayString.merge(nums1, m, nums2, n);
      Assertions.assertArrayEquals(new int[]{1, 2, 2, 3, 5, 6}, nums1);
    }

    @Test
    @DisplayName("Case 2")
    public void mergeSortedArrayCase2() {
      int[] nums1 = new int[]{1};
      int[] nums2 = new int[]{};
      int m = 1;
      int n = 0;

      arrayString.merge(nums1, m, nums2, n);
      Assertions.assertArrayEquals(new int[]{1}, nums1);
    }

    @Test
    @DisplayName("Case 3")
    public void mergeSortedArrayCase3() {
      int[] nums1 = new int[]{0};
      int[] nums2 = new int[]{1};
      int m = 0;
      int n = 1;

      arrayString.merge(nums1, m, nums2, n);
      Assertions.assertArrayEquals(new int[]{1}, nums1);
    }
  }
}