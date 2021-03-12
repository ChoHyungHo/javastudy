package io.codingtest;

import java.util.*;

public class NumberCombin {
    private TreeSet<String> set = new TreeSet<String>();
    private int count;

    public int solution(String numbers) {
        int size = numbers.length();

        List<Character> arr = new ArrayList<Character>();
        for (int i = 0; i < size; i++) {
            arr.add(numbers.charAt(i));
        }

        List<Character> result = new ArrayList<Character>();
        for (int i = 0; i < size; i++) {
            permutation(arr, result, size, i + 1);
        }

        return count;
    }

    private void permutation(List<Character> arr, List<Character> result, int n, int r) {
        if (r == 0) {
            if (result.get(0) != '0') {
                String str = "";
                int size = result.size();
                for (int i = 0; i < size; i++) {
                    str += result.get(i);
                }

                int num = 0;

                if (!set.contains(str)) {
                    num = Integer.parseInt(str);
                    set.add(str);

                    if (isPrime(num)) {
                        System.out.println(num);
                        count++;
                    }
                }
            }
            return;
        }

        for (int i = 0; i < n; i++) {
            result.add(arr.remove(i));
            permutation(arr, result, n - 1, r - 1);
            arr.add(i, result.remove(result.size() - 1));
        }
    }

    private boolean isPrime(int num) {
        return false;
    }
}
