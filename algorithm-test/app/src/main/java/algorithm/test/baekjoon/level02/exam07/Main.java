package algorithm.test.baekjoon.level02.exam07;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
  public static void main(String[] args) throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = new StringTokenizer(br.readLine(), " ");
    int nums[] = new int[3];
    nums[0] = Integer.parseInt(st.nextToken());
    nums[1] = Integer.parseInt(st.nextToken());
    nums[2] = Integer.parseInt(st.nextToken());
    
    if (nums[0] == nums[1] && nums[1] == nums[2]) {
      System.out.println(10000 + nums[0] * 1000);
    } else if (nums[0] != nums[1] && nums[1] != nums[2] && nums[2] != nums[0]) {
      System.out.println(Arrays.stream(nums).max().getAsInt() * 100);
    } else {
      if (nums[0]==nums[1]) System.out.println(1000+nums[0]*100);
      else if (nums[1]==nums[2]) System.out.println(1000+nums[1]*100);
      else if (nums[2]==nums[0]) System.out.println(1000+nums[2]*100);
    }
  }
}
