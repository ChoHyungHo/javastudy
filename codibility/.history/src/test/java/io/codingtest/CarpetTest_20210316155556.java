package io.codingtest;

import static org.junit.Assert.assertArrayEquals;

import org.junit.Test;

public class CarpetTest {
    private Carpet solution = new Carpet();
    @Test
    public void Test1(){
        int brown = 10;
        int yellow = 2;
        int[] actual = solution.solution(brown, yellow);
        int[] expected = {4,3};
        assertArrayEquals(expected, actual);
    }
}
