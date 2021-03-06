package page28.q2703;

import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    String s = new Scanner(System.in).next();
    int max = 0;
    String ss = "";
    for(int i=0, l=s.length(); i<l; i++)
      for(int j=i; j<l; j++) {
        int c = j-i+1;
        String sss = s.substring(i, j+1);
        if(isPerfect(sss)) {
          if(c > max) {
            ss = sss;
            max = c;
          }
        }
      }
    System.out.println(ss);
  }

  private static boolean isPerfect(String s) {
    return new StringBuilder(s).reverse().toString().equals(s);
  }
}
