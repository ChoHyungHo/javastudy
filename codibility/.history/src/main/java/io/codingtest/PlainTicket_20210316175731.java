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
        String toLocation = "";
        int lastIndex = 0;
        int ticketCount = ticketList.size();

        while (ticketCount > 0) {
            for (int i = 0; i < ticketCount; i++) {
                String[] ticket = ticketList.get(i);
                if (startLocation.equals(ticket[0])) {
                    if (toLocation.equals("") || 
                        toLocation.compareTo(ticket[1]) > 0) {
                        toLocation = ticket[1];
                        lastIndex = i;
                    }
                }
            }
            if (toLocation.equals("")) {
                break;
            }
            path.add(toLocation);
            ticketList.remove(lastIndex);

            startLocation = toLocation;
            toLocation = "";
            ticketCount = ticketList.size();
        }

        String[] answer = new String[path.size()];
        for (int i = 0; i < path.size(); i++) {
            answer[i] = path.get(i);
        }
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
