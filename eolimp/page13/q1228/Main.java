package page13.q1228;

import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class Main {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    int n = in.nextInt();
    TreeMap<Long, Integer> ns = new TreeMap<Long, Integer>();
    for(int i=0; i<n; i++) {
      long l = in.nextLong();
      ns.put(l, ns.containsKey(l) ? ns.get(l) + 1 : 1);
    }
    long sum = 0, key;
    for(int i=0; i<n-1; i++) {
      Map.Entry<Long, Integer> low = ns.pollFirstEntry();
      if(low.getValue() > 1) {
        key = 2 * low.getKey();
        if(low.getValue() > 2) ns.put(low.getKey(), low.getValue()-2);
      } else {
        Map.Entry<Long, Integer> high = ns.pollFirstEntry();
        key = high.getKey() + low.getKey();
        if(high.getValue() > 1) ns.put(high.getKey(), high.getValue()-1);
      }
      ns.put(key, ns.containsKey(key) ? ns.get(key) + 1 : 1);
      sum += key;
    }
    System.out.println(sum);
  }
}
