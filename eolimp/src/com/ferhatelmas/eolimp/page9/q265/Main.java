package com.ferhatelmas.eolimp.page9.q265;

import java.math.BigInteger;
import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    System.out.println(new BigInteger(in.nextLine())
        .add(new BigInteger(in.nextLine())));
  }
}