package com.eomcs.lang.ex07;

import java.util.Scanner;

public class Exam002 {
  static void printStarLen(int spaceLen) {
    for (int spaceCnt = 1; spaceCnt <= spaceLen; spaceCnt++) {
      System.out.print(" ");
    }
  }

  static void printStar(int starLen) {
    for (int starCnt = 1; starCnt <= starLen; starCnt++) {
      System.out.print("*");
    }
  }

  static int countSpaceLen(int len, int starLen) {
    return (len - starLen) / 2;
  }

  static int promptInt(String title) {
    Scanner keyScan = new Scanner(System.in);
    System.out.print(title);
    int len = keyScan.nextInt();
    keyScan.close();

    return len;
  }

  public static void main(String[] args) {
    int len = promptInt("밑변의 길이? ");

    for (int starLen = 1; starLen <= len; starLen += 2) {
      int spaceLen = countSpaceLen(len, starLen);
      printStarLen(spaceLen);
      printStar(starLen);
      System.out.println();
    }
  }
}
