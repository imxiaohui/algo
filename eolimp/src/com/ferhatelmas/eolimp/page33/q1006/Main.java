package com.ferhatelmas.eolimp.page33.q1006;

import java.util.Scanner;

public class Main {

  public static void main(String[] args) {

    Scanner in = new Scanner(System.in);
    int base = in.nextInt();
    int l1 = in.nextInt();
    String s1 = new StringBuilder(in.next()).reverse().toString();
    int l2 = in.nextInt();
    String s2 = new StringBuilder(in.next()).reverse().toString();

    int t = 0, cnt = 0;
    for(int i=0; i<Math.min(l1, l2); i++) {
      t = (valueOf(s1.charAt(i)) + valueOf(s2.charAt(i)) + t) / base;
      if(t > 0) cnt++;
    }

    System.out.println(cnt);
  }

  private static int valueOf(char c) {
    if(c >= '0' && c <= '9') return c - '0';
    else if(c >= 'A' && c <= 'Z') return c - 'A' + 10;
    return c - 'a' + 36;
  }

}
