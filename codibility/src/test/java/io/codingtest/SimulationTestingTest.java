package io.codingtest;

import static org.junit.Assert.assertArrayEquals;

import org.junit.Test;

public class SimulationTestingTest {
    SimulationTesting solution =  new SimulationTesting();

    @Test
    public void Test1(){
        int[] answers = {1,2,3,4,5};
        int[] actuals = solution.solution(answers);
        int[] expecteds = {1};
        assertArrayEquals(expecteds, actuals);
    }

    @Test
    public void Test2(){
        int[] answers = {1,3,2,4,2};
        int[] actuals = solution.solution(answers);
        int[] expecteds = {1,2,3};
        assertArrayEquals(expecteds, actuals);
    }

    @Test
    public void Test3(){
        int[] answers = {1,2,3,4,5,1,2,3,4,5};
        int[] actuals = solution.solution(answers);
        int[] expecteds = {1};
        assertArrayEquals(expecteds, actuals);
    }

    @Test
    public void Test4(){
        int[] answers = {2, 1, 2, 3, 2, 4, 2, 5};
        int[] actuals = solution.solution(answers);
        int[] expecteds = {2};
        assertArrayEquals(expecteds, actuals);
    }
}
