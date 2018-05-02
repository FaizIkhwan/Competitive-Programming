/*
speed.java

Problem:
  Given a list of {mph, total elapsed hours}, compute the total distance driven

*/

import java.io.*;
import java.util.*;

public class speed {

  public static void main(String[] arg) {
    Scanner sc = new Scanner(System.in);

    int mph;
    int hours;
    int numSigns = sc.nextInt();

    while ( numSigns > 0) {
      int distance = 0;
      int oldHours = 0;

      for (int i=0; i<numSigns; i++) {
         mph = sc.nextInt();
         hours = sc.nextInt();
         distance += mph * (hours - oldHours);
         oldHours = hours;
      }

      System.out.println(distance + " miles" );

      numSigns = sc.nextInt();
    }

  }

}
