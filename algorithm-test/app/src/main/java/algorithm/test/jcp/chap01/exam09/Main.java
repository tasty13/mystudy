package algorithm.test.jcp.chap01.exam09;

public class Main {
  public static void main(String[] args) {

  }

  public static String joinByDelimiter(char delimiter, String... args) {
    StringBuilder result = new StringBuilder();
    int i = 0;
    for (i = 0; i < args.length - 1; i++) {
      result.append(args[i]);
    }
    result.append(args[i]);
    return result.toString();
  }
}
