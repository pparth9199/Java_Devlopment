package test;

import java.util.*;

public class driver {

  public static int minDeletions(List<Integer> numbers) {
    int result = 0;
    int n = numbers.size();
    int[] lis = new int[n];

    for (int i = 0; i < n; i++)
      lis[i] = 1;

    for (int i = 1; i < n; i++)
      for (int j = 0; j < i; j++)
        if (numbers.get(i) > numbers.get(j) && lis[i] < lis[j] + 1)
          lis[i] = lis[j] + 1;

    for (int i = 0; i < n; i++)
      if (result < lis[i])
        result = lis[i];

    if (n - result - 1 > 0)
      return n - result - 1;
    else
      return 0;
  }

  public static void main(String[] args) {
    List<Integer> list = new ArrayList<Integer>();
    list.add(1);
    list.add(2);
    list.add(3);
    list.add(4);
    list.add(5);
    list.add(6);
    list.add(8);
    list.add(7);
    list.add(9);
    list.add(10);
    System.out.println(minDeletions(list));
  }
}