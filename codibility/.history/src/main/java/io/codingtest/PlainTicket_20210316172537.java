package io.codingtest;

import java.util.*;

public class PlainTicket {

    public String[] solution(String[][] tickets) {
        List<String[]> ticketList = new ArrayList<String[]>();
        for (int i = 0; i < tickets.length; i++) {
            ticketList.add(tickets[i]);
        }
        List<String> path = new ArrayList<String>();
        String startLocation = "ICN";
        path.add(startLocation);
        getPath(startLocation, ticketList, path);
        
        String[] answer = {};
        return answer;
    }

    private void getPath(String fromLocation, List<String[]> ticketList, List<String> path) {
        if (ticketList.size() == 0) {
            return;
        }

        for (int i = 0; i < ticketList.size(); i++) {
            if (fromLocation.equals(ticketList.get(i)[0])) {
                String toLocation = ticketList.remove(i)[1];
                System.out.println(toLocation);
                path.add(toLocation);
                getPath(toLocation, ticketList, path);
                break;
            } 
        }
    }
    
}
