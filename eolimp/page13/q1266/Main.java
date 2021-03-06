package page13.q1266;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Main {

  private static int max;
  private static Integer[] tracks;

  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);

    while(in.hasNextInt()) {
      int n = in.nextInt();

      tracks = new Integer[in.nextInt()];
      for(int i=0; i<tracks.length; i++) tracks[i] = in.nextInt();
      max = 0;
      Arrays.sort(tracks, Collections.reverseOrder());
      sum(n, 0, 0);
      System.out.println("sum:" + max);
    }
  }

  private static void sum(int n, int offset, int sum) {
    if(offset == tracks.length) {
      max = Math.max(sum, max);
      return;
    }

    if(max < n) {
      sum(n, offset+1, sum);
      if(sum + tracks[offset] <= n) sum(n, offset+1, sum + tracks[offset]);
    }
  }
}
