package page64.q6317;

import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);

    int r1[] = new int[2], r2[] = new int[2],
        x1 = in.nextInt(), x2;
    String s[] = in.next().split(":");
    for(int i=0; i<2; i++) r1[i] = Integer.parseInt(s[i]);
    x2 = in.nextInt();
    s = in.next().split(":");
    for(int i=0; i<2; i++) r2[i] = Integer.parseInt(s[i]);

    double h1 = Math.sqrt(Math.pow(r1[0], 2) + Math.pow(r1[1], 2)),
           h2 = Math.sqrt(Math.pow(r2[0], 2) + Math.pow(r2[1], 2)),
           a1 = (x1 * r1[0] / h1) * (x1 * r1[1] / h1) / 2,
           a2 = (x2 * r2[0] / h2) * (x2 * r2[1] / h2) / 2;
    int c = 0;
    if(a1 < a2) c = 2;
    else if(a1 > a2) c = 1;
    System.out.println(c);
  }
}
