package page61.q6008;

import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    long i = 1, t;

    while((t = in.nextInt()) != -1) {
      int s = (int)((Math.sqrt(1 + 8*t) - 1) / 2);
      System.out.println("Case " + (i++) + ": " + (s * (s+1) == 2*t ? s : "bad"));
    }
  }
}
