package page64.q6386;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);

    int t, c = 1;
    while((t = in.nextInt()) != 0) {
      final String alphabet = in.next();
      String s[] = new String[t];
      for(int i=0; i<t; i++) s[i] = in.next();
      Arrays.sort(s, new Comparator<String>() {
        @Override
        public int compare(String o1, String o2) {
          int l1 = o1.length(), l2 = o2.length();
          for(int i=0, m=Math.min(l1, l2); i<m; i++) {
            char c1 = o1.charAt(i), c2 = o2.charAt(i);
            if(c1 != c2) {
              int p1 = alphabet.indexOf(c1),
                  p2 = alphabet.indexOf(c2);
              return p1 - p2;
            }
          }
          return l1-l2;
        }
      });
      System.out.println("year " + c++);
      for(String ss : s) System.out.println(ss);
    }
  }
}
