package page16.q1543;

import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);

    while(in.hasNextInt()) {
      System.out.println(2 * in.nextInt() * in.nextInt());
    }
  }
}
