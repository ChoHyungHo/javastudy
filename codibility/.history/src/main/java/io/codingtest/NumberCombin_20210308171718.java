package io.codingtest;

import java.util.*;

public class NumberCombin {
    public int solution(String numbers){
        char[] numChars = numbers.toCharArray();
        char[] path = new char[numChars.length];
        for (char c : path) {
            // c = Character.sp;
        }
        boolean[] visited = new boolean[numChars.length];
        Map<Integer, Integer> numerics = new HashMap<Integer, Integer>();
        
        for (int len = 1; len <= numChars.length; len++) {
            getNumbers(0, len, numChars, visited, numerics);
        }
        int answer = 0;
        return answer;
    }

    private void getNumbers(int idx, int length, char[] numChars, boolean[] visited, Map<Integer, Integer> numerics) {
        for (int i = 0; i < numChars.length; i++) {
            // if (!visited[i] && ) {
            //     visited[i] = true;
            //     getNumbers(idx++, length, numChars, visited, )
            // }
        }
    }
}
