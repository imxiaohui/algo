package page5.q419;

import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    while(in.hasNextInt()) {
      int a = in.nextInt(), b = in.nextInt(), max = 0;
      for(int i=Math.min(a, b), j=Math.max(a, b); i<=j; i++)
        max = Math.max(max, getCycleLength(i));
      System.out.println(a + " " + b + " " + max);
    }
  }

  private static int getCycleLength(int n) {
    int cnt = 1;
    while(n != 1) {
      if(n%2 == 0) n /= 2;
      else n = 3*n + 1;
      cnt++;
    }
    return cnt;
  }
}
