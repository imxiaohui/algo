package page41.q4039;

import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    int t = in.nextInt();

    PriorityQueue<Integer> pq = new PriorityQueue<Integer>(t, new Comparator<Integer>() {
      @Override
      public int compare(Integer o1, Integer o2) {
        return o2 - o1;
      }
    });
    while(t-- > 0) {
      if(in.nextInt() == 0) pq.add(in.nextInt());
      else System.out.println(pq.poll());
    }
  }
}
