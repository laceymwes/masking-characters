package edu.cnm.deepdive.mask;

public class Main {

  public static void main(String[] args) {

  }

  public static String masked(String input, char mask, float unmaskedFraction, int maxUnmasked) {
    if (input.length() == 0) {
      return input;
    }
    int fraction = (int)(Math.floor(input.length() * unmaskedFraction));
    int numUnMasked = Math.min(fraction, maxUnmasked);
    int maskedChars = input.length() - numUnMasked;
    StringBuilder builder = new StringBuilder(input.trim());
    for (int i = 0; i < maskedChars; i ++) {
      builder.setCharAt(i, mask);
    }
    return builder.toString();
  }
}
