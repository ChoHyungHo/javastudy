package io.codingtest;

import java.text.*;

public class AdTimeSolution {
    public String solution(String play_time, String adv_time, String[] logs) throws ParseException {
        String answer = "";
        int[] logs_start_sec = new int[logs.length];
        int[] logs_end_sec = new int[logs.length];
        for(int i = 0; i < logs.length; i++){
            logs_start_sec[i] = getSecondsFromTime(logs[i].split("-")[0]);
            logs_end_sec[i] = getSecondsFromTime(logs[i].split("-")[1]);
        }

        int[] total_time = new int[360000];
        for (int i = 0; i < logs.length; i++){
            total_time[logs_start_sec[i]] = total_time[logs_start_sec[i]] + 1;
            total_time[logs_end_sec[i]] = total_time[logs_end_sec[i]] - 1;
        }

        for (int i = 1; i < total_time.length; i++) {
            total_time[i] = total_time[i-1] + total_time[i];
        }

        int adv_time_sec = getSecondsFromTime(adv_time);
        int play_time_sec = getSecondsFromTime(play_time);
        int remain_time = play_time_sec - adv_time_sec;
        int[] sum_time = new int[remain_time];
        for (int i = 0; i < sum_time.length; i++) {
            sum_time[i] = sumTimes(i, adv_time_sec, total_time);
        }

        int max_time = 0;
        int ad_time = 0;
        for (int i = 0; i < sum_time.length; i++) {
            if (max_time < sum_time[i]) {
                max_time = sum_time[i];
                ad_time = i;
            }
        }

        answer = getSecondsToTime(ad_time);
        return answer;
    }

    private int sumTimes(int start_index, int adv_time_sec, int[] total_time) {
        int sum = 0;
        for (int i = start_index; i <= (start_index + adv_time_sec); i++) {
            sum += total_time[i];
        }
        return sum;
    }

    public int getSecondsFromTime(String time) throws ParseException {
        String[] times = time.split(":");
        int hour = Integer.parseInt(times[0]);
        int min = Integer.parseInt(times[1]);
        int sec = Integer.parseInt(times[2]);
        return (hour * 60 * 60) + (min * 60) + sec;
    }
    public String getSecondsToTime(int seconds) throws ParseException {
        int hour = seconds/60/60;
        int min = (seconds - (hour * 60 * 60)) / 60;
        int sec = seconds - (hour * 60 * 60) - (min * 60);
        DecimalFormat df = new DecimalFormat("00");
        return df.format(hour) + ":" + df.format(min) + ":" + df.format(sec);
    }
}
