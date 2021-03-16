package io.codingtest;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class PlaingTicketTest {
    private PlainTicket solution = new PlainTicket();
    @Test
    public void Test1(){
        String[] expecteds = {"ICN", "JFK", "HND", "IAD"};
        String[][] tickets = {{"ICN", "JFK"}, {"HND", "IAD"}, {"JFK", "HND"}};
        String[] actuals = solution.solution(tickets);
        assertArrayEquals(expecteds, actuals);
    }
}
