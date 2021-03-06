package page45.q4433;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    ArrayList<Character> ls = new ArrayList<Character>();
    int cnt = 0;
    String s = "[{(", e = "]})";
    for(char c : new Scanner(System.in).nextLine().toCharArray()) {
      if(s.indexOf(c) >= 0) {
        ls.add(c);
        cnt++;
      } else {
        if(cnt == 0) {
          System.out.println("NO");
          return;
        } else {
          if(s.indexOf(ls.remove(--cnt)) != e.indexOf(c)) {
            System.out.println("NO");
            return;
          }
        }
      }
    }
    System.out.println(cnt == 0 ? "YES" : "NO");
  }
}
