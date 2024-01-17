// 활용 - 지정한 폴더 및 그 하위 폴더까지 모두 검색하여 파일 및 디렉토리 이름을 출력하라.
package com.eomcs.io.ex01;

import java.io.File;

public class Exam0710_00 {

  public static void main(String[] args) throws Exception {

    // 결과 예)
    // /Users/bitcamp/git/test
    // src/
    //   main/
    //     java/
    //       com/
    //         Hello.java
    //         Hello2.java
    // build.gradle
    // settings.gradle
    // Hello.java
    // ...

    // 1) 현재dir 경로 출력
    File dir = new File(".");
    System.out.println(dir.getCanonicalPath());
    printList(dir, 1); // 현재파일 0으로 출력했으니 하위dir 1부터 시작

  }

  static void printList(File dir, int level) {
    // 2) 현재dir/파일 목록 출력
    File[] files = dir.listFiles();

    // 3) 리턴받은 파일 배열에서 이름 꺼내서 출력
    String indent = getIndent(level);
    for (File file : files) {
      System.out.print(indent); // 공백출력
      if (file.isDirectory() && !file.isHidden()) { // 만약 dir+!hiddenfile일시 재귀호출
        System.out.println(file.getName());
        printList(file, level + 1);
      } else if (file.isFile()) { // 만약 일반파일일시 이름출력
        System.out.println(file.getName());
      }
    }
  }

  static String getIndent(int level) {
    StringBuilder sb = new StringBuilder();
    for (int i = 0; i < level; i++) {
      sb.append("  ");
    }
    return sb.toString();
  }

}


