package com.ferhatelmas.eolimp.page41.q1237;

import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    int n = new Scanner(System.in).nextInt(), max = Integer.MIN_VALUE;
    for(int i=n, j=0; i>0; ) {
      max = Math.max(max, getProduct(i));
      i = next(i, ++j);
    }
    System.out.println(max);
  }

  private static int getProduct(int n) {
    int mul = 1;
    for(char c : String.valueOf(n).toCharArray())
      mul *= c-'0';
    return mul;
  }

  private static int next(int i, int j) {
    int m = i%(int)Math.pow(10, j);
    return i-m-1;
  }
}
