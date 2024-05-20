package ru.surkov.leetcode.TopInterview150.ArrayString.hard;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

class ArrayStringHardTest {

  ArrayStringHard arrayStringHard;

  @BeforeEach
  public void setup() {
    arrayStringHard = new ArrayStringHard();
  }

  @Nested
  @DisplayName("135. Candy.")
  class Candy {

    @Test
    @DisplayName("Case 1")
    public void case1() {
      int[] ratings = new int[]{1, 0, 2};
      int k = arrayStringHard.candy(ratings);
      assertEquals(5, k);
    }

    @Test
    @DisplayName("Case 2")
    public void case2() {
      int[] ratings = new int[]{1, 2, 2};
      int k = arrayStringHard.candy(ratings);
      assertEquals(4, k);
    }

    @Test
    @DisplayName("Case 3")
    public void case3() {
      int[] ratings = new int[]{1, 2, 2, 0, 1};
      int k = arrayStringHard.candy(ratings);
      assertEquals(8, k);
    }
  }
}