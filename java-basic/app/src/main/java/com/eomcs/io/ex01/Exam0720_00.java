// 활용 - 지정한 폴더를 삭제하라.
package com.eomcs.io.ex01;

import java.io.File;

public class Exam0720_00 {

  public static void main(String[] args) throws Exception {

    // temp10 디렉토리를 삭제하기
    File dir = new File("temp10");
    deleteFiles(dir);
  }

  static void deleteFiles(File dir) {
    System.out.println(dir.getAbsolutePath());
    // 디렉토리면 안으로 들어가서 파일 목록 뽑아서 하나씩 삭제
    if (dir.isDirectory()) {
      File[] files = dir.listFiles();
      for (File file : files) {
        deleteFiles(file);
      }
    }
    dir.delete();
  }


}


