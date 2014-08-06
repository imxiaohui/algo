package page48.q4740;

import java.util.HashMap;
import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    int n = in.nextInt(), x;
    HashMap<Integer, Integer> t = new HashMap<Integer, Integer>();
    while(n-- > 0) {
      x = in.nextInt();
      t.put(x, t.containsKey(x) ? t.get(x) + 1 : 1);
    }

    int max = 0, mk = 1001;
    for(int k : t.keySet()) {
      if(t.get(k) > max || (t.get(k) == max && k < mk)) {
        mk = k;
        max = t.get(k);
      }
    }
    System.out.println(mk);
  }
}
