package io.codingtest;

public class Carpet {
    public int[] solution(int brown, int yello) {
        int total = brown + yello;
        int xLength = 0;
        int yLength = 0;
        for (int x = 3; x < total; x++) {
            if (total % x == 0) {
                xLength = x;
                yLength = total / x;
                if (yello == (x - 2) * (yLength - 2)) {
                    if (x < yLength) {
                        xLength = yLength;
                        yLength = x;
                    }
                    break;
                }
            }
        }
        int[] answer = {xLength, yLength};
        return answer;
    }
}
