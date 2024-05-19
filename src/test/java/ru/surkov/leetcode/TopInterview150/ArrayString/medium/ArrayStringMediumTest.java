package ru.surkov.leetcode.TopInterview150.ArrayString.medium;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

class ArrayStringMediumTest {

  ArrayStringMedium arrayStringMedium;

  @BeforeEach
  public void setup() {
    arrayStringMedium = new ArrayStringMedium();
  }

  @Nested
  @DisplayName("80.Remove Duplicate from Sorted Array 2")
  class RemoveDuplicateSortedArray2 {

    @Test
    @DisplayName("Case 1")
    public void case1() {
      int[] nums = new int[]{1, 1, 1, 2, 2, 3};
      int k = arrayStringMedium.removeDuplicates(nums);
      assertEquals(5, k);
    }

    @Test
    @DisplayName("Case 2")
    public void case2() {
      int[] nums = new int[]{0, 0, 1, 1, 1, 1, 2, 3, 3};
      int k = arrayStringMedium.removeDuplicates(nums);
      assertEquals(7, k);
    }
  }

  @Nested
  @DisplayName("189.Rotate Array")
  class RotateArray {

    @Test
    @DisplayName("Case 1")
    public void case1() {
      int[] nums = new int[]{1, 2, 3, 4, 5, 6, 7};
      int k = 3;
      arrayStringMedium.rotate(nums, k);
      Assertions.assertArrayEquals(new int[]{5, 6, 7, 1, 2, 3, 4}, nums);
    }

    @Test
    @DisplayName("Case 2")
    public void case2() {
      int[] nums = new int[]{-1, -100, 3, 99};
      int k = 2;
      arrayStringMedium.rotate(nums, k);
      Assertions.assertArrayEquals(new int[]{3, 99, -1, -100}, nums);
    }
  }

}