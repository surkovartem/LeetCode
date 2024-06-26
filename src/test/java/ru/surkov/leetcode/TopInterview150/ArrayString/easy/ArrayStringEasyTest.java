package ru.surkov.leetcode.TopInterview150.ArrayString.easy;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.DisplayName;

public class ArrayStringEasyTest {

  ArrayStringEasy arrayStringEasy;

  @BeforeEach
  public void setup() {
    arrayStringEasy = new ArrayStringEasy();
  }

  @Nested
  @DisplayName("88. Merge Sorted Array.")
  class MergeSotredArray {

    @Test
    @DisplayName("Case 1")
    public void case1() {
      int[] nums1 = new int[]{1, 2, 3, 0, 0, 0};
      int[] nums2 = new int[]{2, 5, 6};
      int m = 3;
      int n = 3;

      arrayStringEasy.merge(nums1, m, nums2, n);
      Assertions.assertArrayEquals(new int[]{1, 2, 2, 3, 5, 6}, nums1);
    }

    @Test
    @DisplayName("Case 2")
    public void case2() {
      int[] nums1 = new int[]{1};
      int[] nums2 = new int[]{};
      int m = 1;
      int n = 0;

      arrayStringEasy.merge(nums1, m, nums2, n);
      Assertions.assertArrayEquals(new int[]{1}, nums1);
    }

    @Test
    @DisplayName("Case 3")
    public void case3() {
      int[] nums1 = new int[]{0};
      int[] nums2 = new int[]{1};
      int m = 0;
      int n = 1;

      arrayStringEasy.merge(nums1, m, nums2, n);
      Assertions.assertArrayEquals(new int[]{1}, nums1);
    }
  }

  @Nested
  @DisplayName("27. Remove Element.")
  class RemoveElement {

    @Test
    @DisplayName("Case 1")
    public void case1() {
      int[] nums = new int[]{3, 2, 2, 3};
      int val = 3;

      int k = arrayStringEasy.removeElement(nums, val);
      assertEquals(2, k);
    }

    @Test
    @DisplayName("Case 2")
    public void case2() {
      int[] nums = new int[]{0, 1, 2, 2, 3, 0, 4, 2};
      int val = 2;

      int k = arrayStringEasy.removeElement(nums, val);
      assertEquals(5, k);
    }
  }

  @Nested
  @DisplayName("26. Remove duplicates.")
  class RemoveDuplicates {

    @Test
    @DisplayName("Case 1")
    public void case1() {
      int[] nums = new int[]{1, 1, 2};
      int k = arrayStringEasy.removeDuplicates(nums);
      assertEquals(2, k);
    }

    @Test
    @DisplayName("Case 2")
    public void case2() {
      int[] nums = new int[]{0, 0, 1, 1, 1, 2, 2, 3, 3, 4};
      int k = arrayStringEasy.removeDuplicates(nums);
      assertEquals(5, k);
    }
  }

  @Nested
  @DisplayName("169.Majority Element")
  class MajorityElement {

    @Test
    @DisplayName("Case 1")
    public void case1() {
      int[] nums = new int[]{3, 2, 3};
      int max = arrayStringEasy.majorityElement(nums);
      assertEquals(3, max);
    }

    @Test
    @DisplayName("Case 2")
    public void case2() {
      int[] nums = new int[]{2, 2, 1, 1, 1, 2, 2};
      int max = arrayStringEasy.majorityElement(nums);
      assertEquals(2, max);
    }
  }

  @Nested
  @DisplayName("121. Best Time to Buy and Sell Stock")
  class BestTimeToBuy {

    @Test
    @DisplayName("Case 1")
    public void case1() {
      int[] prices = new int[]{7,1,5,3,6,4};
      int profit = arrayStringEasy.maxProfit(prices);
      assertEquals(5, profit);
    }

    @Test
    @DisplayName("Case 2")
    public void case2() {
      int[] prices = new int[]{7,6,4,3,1};
      int profit = arrayStringEasy.maxProfit(prices);
      assertEquals(0, profit);
    }
  }
}