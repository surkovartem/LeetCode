package ru.surkov.leetcode.TopInterview150.ArrayString.medium;

import static org.junit.jupiter.api.Assertions.assertEquals;

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

}