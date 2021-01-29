package io.codingtest;

import java.util.Arrays;

public class MissingElement {
    public int solution(int[] A) {
        Arrays.sort(A);
        return find_answer(A, ((A.length - 1) / 2), 0, (A.length - 1));
    }

    private int find_answer(int[] arr, int mid_idx, int str_idx, int lst_idx){
        if (lst_idx == -1) {
            return 1;
        }
        if (lst_idx == str_idx) {
            
            if (arr[mid_idx] == (mid_idx + 1)) {
                return mid_idx + 2;
            } 
            return mid_idx + 1;
        }
        if (arr[mid_idx] == (mid_idx + 1)) {
            str_idx = mid_idx + 1;
            mid_idx = ((lst_idx - str_idx) / 2) + str_idx;
        } else {
            lst_idx = mid_idx;
            mid_idx = ((lst_idx - str_idx) / 2) + str_idx;
        }
        return find_answer(arr, mid_idx, str_idx, lst_idx);
    }
}
