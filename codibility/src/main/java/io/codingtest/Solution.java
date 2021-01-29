package io.codingtest;

import java.util.Arrays;

public class Solution {
    public int solution() {
        int[] length = {0, 1, 5, 8, 9, 10, 17, 17, 20, 24, 30};
        int result = cutRod(length, 10);
        return result;
    }

    private int cutRod(int[] p, int n) {
        int[] r = new int[n];
        int q = -1;
        for (int j = 1; j <= n; j++) {
            q = -1;
            for (int i = 1; i <= j; i++) {
                q = Math.max(q, p[i] + r[j - i]);
            }
            r[j] = q;
        }
        return r[n];
    }

    public String solution(String new_id){
        String answer = "";
        // 소문자
        new_id = new_id.toLowerCase();
        
        // 특수문자 제거
        new_id = new_id.replaceAll("[ ~!@#$%^&*()=+[{]}:?,<>/ ]", "");
        
        // 2개 이상 .를 1개로 치환
        new_id = new_id.replaceAll("[.]+", ".");

        // 마침표 처음과 끝에 위치하면 제거
        new_id = new_id.replaceAll("^[.]|[.]$", "");

        if (new_id == ""){
            new_id = "a";
        }

        if (new_id.length() < 3){
            new_id = GetOverThreeLength(new_id);
        }
        answer = new_id;
        return answer;
    }

    private String GetOverThreeLength(String str) {
        if (str.length() >= 3) {
            return str;
        }
        return GetOverThreeLength(str + str.charAt(str.length() - 1));
    }

    public int solution(int[][] board, int r, int c) {
        int answer = 0;
        return answer;
    }

    public int solution2(int X, int Y, int D) {
        int times = ((Y - X) / D);
        int remainder = ((Y - X) % D);
        if (remainder != 0) {
            times += 1;
        }
        return times;
    }

    // int[] A = {9, 3, 9, 3, 9, 10, 9 };
    public int solution1(int[] A){
        Arrays.sort(A);
        System.out.println(Arrays.toString(A));
        int answer = 0;
        for (int i = 0; i < A.length; i += 2) {
            if ((i + 1) >= A.length || A[i] != A[i + 1]) {
                answer = A[i];
                break;
            }
        }
        return answer;
    }
}
