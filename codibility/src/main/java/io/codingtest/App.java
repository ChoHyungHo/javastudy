package io.codingtest;

import java.text.ParseException;

/**
 * Hello world!
 *
 */
public class App {
    public static void main(String[] args) throws ParseException
    {
        // Solution solution = new Solution();
        // // int[] A = {9, 3, 9, 3, 9, 10, 9 };
        // // int X = 100, Y = 100, D = 20;
        // // System.out.println(solution.solution(X, Y, D));
        // String new_id;
        // new_id = "...!@BaT#*..y.abcdefghijklm";
        // // new_id = "ab";
        // // new_id = "z-+.^.";
        // System.out.println(solution.solution());

        AdTimeSolution solution = new AdTimeSolution();
        String play_time = "02:03:55";
        String adv_time = "00:14:15";
        String[] logs = {"01:20:15-01:45:14", "00:40:31-01:00:00", "00:25:50-00:48:29", "01:30:59-01:53:29", "01:37:44-02:02:30"};
        // String result = "01:30:59";
        System.out.println(solution.solution(play_time, adv_time, logs));
    }
}
