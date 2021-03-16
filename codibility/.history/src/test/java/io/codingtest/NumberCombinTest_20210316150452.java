package io.codingtest;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class NumberCombinTest {
    NumberCombin solution = new NumberCombin();

    @Test
    public void Test1(){
        String numbers = "17";
        int actual = solution.solution(numbers);
        int expected = 3;
        // actual = expected;
        assertEquals(expected, actual);
    }

    @Test
    public void Test2(){
        String numbers = "011";
        int actual = solution.solution(numbers);
        int expected = 2;
        assertEquals(expected, actual);
    }

    @Test
    public void Test3(){
        String numbers = "513";
        int actual = solution.solution(numbers);
        int expected = 5;
        assertEquals(expected, actual);
    }
}
