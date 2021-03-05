package io.codingtest;

import java.util.*;

public class SimulationTesting {
    public int[] solution(int[] answers) {
        int[] first = {1, 2, 3, 4, 5};
        int[] second = {2, 1, 2, 3, 2, 4, 2, 5};
        int[] third = {3, 3, 1, 1, 2, 2, 4, 4, 5, 5};
        int[] correctCnt = {0, 0, 0};

        int fst_i = 0;
        int snd_i = 0;
        int trd_i = 0;
        for (int i = 0; i < answers.length; i++) {
            if (answers[i] == first[fst_i++]) {
                correctCnt[0]++;
            }
            if (fst_i >= first.length) {
                fst_i = 0;
            }
            
            if (answers[i] == second[snd_i++]) {
                correctCnt[1]++;
            }
            if (snd_i >= second.length) {
                snd_i = 0;
            }
            
            if (answers[i] == third[trd_i++]) {
                correctCnt[2]++;
            }
            if (trd_i >= third.length) {
                trd_i = 0;
            }
        }

        int[] answerOrder = {0, 0, 0};

        answerOrder[0] = 1;

        if (correctCnt[0] < correctCnt[1]) {
            answerOrder[0] = 2;
            if (correctCnt[1] < correctCnt[2]) {
                answerOrder[0] = 3;
            } else if (correctCnt[1] == correctCnt[2]) {
                answerOrder[1] = 3;
            }
        } else if (correctCnt[0] == correctCnt[1]) {
            answerOrder[1] = 2;
            if (correctCnt[1] < correctCnt[2]) {
                answerOrder[0] = 3;
                answerOrder[1] = 0;
            } else if (correctCnt[1] == correctCnt[2]) {
                answerOrder[2] = 3;
            }
        } else {
            if (correctCnt[0] < correctCnt[2]) {
                answerOrder[0] = 3;
            } else if (correctCnt[0] == correctCnt[2]) {
                answerOrder[1] = 3;
            }
        }

        List<Integer> answerList = new ArrayList<Integer>();

        for (int a : answerOrder) {
            if (a > 0) {
                answerList.add(a);
            }
        }

        int[] answer = new int[answerList.size()];

        for (int i = 0; i< answerList.size(); i++) {
            answer[i] = answerList.get(i);
        }

        return answer;
    }
}
