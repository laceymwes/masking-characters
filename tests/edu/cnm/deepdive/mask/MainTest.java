package edu.cnm.deepdive.mask;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class MainTest {

  private static final String TEST_STRING_ONE = "ABCDEF";
  private static final char TEST_MASK_ONE = '*';
  private static final float TEST_FRACTION_ONE = 0.5f;
  private static final int TEST_MAX_ONE = 4;
  private static final String RESULT_ONE = "***DEF";

  private static final String TEST_STRING_TWO = "4242424242424242";
  private static final char TEST_MASK_TWO = '-';
  private static final float TEST_FRACTION_TWO= 0.5f;
  private static final int TEST_MAX_TWO = 4;
  private static final String RESULT_TWO = "------------4242";

  @Test
  void masked() {
    assertEquals(RESULT_ONE,
        Main.masked(TEST_STRING_ONE, TEST_MASK_ONE, TEST_FRACTION_ONE, TEST_MAX_ONE));
    assertEquals(RESULT_TWO,
        Main.masked(TEST_STRING_TWO, TEST_MASK_TWO, TEST_FRACTION_TWO, TEST_MAX_TWO));
  }
}