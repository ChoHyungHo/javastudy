package io.codingtest;

import java.util.*;

public class NumberCombin {
    private TreeSet<String> set = new TreeSet<String>();
    private int count;

    public int solution(String numbers) {
        // int size = numbers.length();

        // List<Character> arr = new ArrayList<Character>();
        // for (int i = 0; i < size; i++) {
        //     arr.add(numbers.charAt(i));
        // }

        // List<Character> result = new ArrayList<Character>();
        // for (int i = 0; i < size; i++) {
        //     permutation(arr, result, size, i + 1);
        // }

        // return count;
        HashSet<Integer> set = new HashSet<>();
        permutation("", numbers, set);
        int count = 0;
        while(set.iterator().hasNext()){
            int a = set.iterator().next();
            set.remove(a);
            if(a==2) count++;
            if(a%2!=0 && isPrime(a)){
                count++;
            }
        }        
        return count;
    }

    public void permutation(String prefix, String str, HashSet<Integer> set) {
        int n = str.length();
        //if (n == 0) System.out.println(prefix);
        if(!prefix.equals("")) set.add(Integer.valueOf(prefix));
        for (int i = 0; i < n; i++)
          permutation(prefix + str.charAt(i), str.substring(0, i) + str.substring(i+1, n), set);

    }

    private void permutation(List<Character> arr, List<Character> result, int arrSize, int remainedLength) {
        if (remainedLength == 0) {
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

        for (int i = 0; i < arrSize; i++) {
            result.add(arr.remove(i));
            permutation(arr, result, arr.size(), remainedLength - 1);
            arr.add(i, result.remove(result.size() - 1));
        }
    }

    private boolean isPrime(int n) {
        int i;
		int sqrt = (int) Math.sqrt(n);

		// 2는 유일한 짝수 소수
		if (n == 2)
			return true;

		// 짝수와 1은 소수가 아님
		if (n % 2 == 0 || n == 1)
			return false;

		// 제곱근까지만 홀수로 나눠보면 됨
		for (i = 3; i <= sqrt; i += 2) {
			if (n % i == 0)
				return false;
		}

		return true;
    }
}
