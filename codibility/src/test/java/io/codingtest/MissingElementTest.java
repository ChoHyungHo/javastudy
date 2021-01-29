package io.codingtest;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.util.Arrays;

import org.junit.Test;

public class MissingElementTest {
    @Test
    public void solutionTest2(){
        int[] A = {2, 3, 1, 5};
        MissingElement test = new MissingElement();

        assertEquals(4, test.solution(A));
    }

    @Test
    public void solutionTest3(){
        int[] A = {1, 2, 3, 4, 6, 7, 8, 9, 10};
        MissingElement test = new MissingElement();

        assertEquals(5, test.solution(A));
    }

    @Test
    public void solutionTest4(){
        int[] A = {1, 2, 3, 4, 5, 6, 7, 8, 9, 11};
        MissingElement test = new MissingElement();

        assertEquals(10, test.solution(A));
    }

    @Test
    public void solutionTest5(){
        int[] A = {2, 3, 4, 5, 6, 7, 8, 9, 10, 11};
        MissingElement test = new MissingElement();

        assertEquals(1, test.solution(A));
    }

    @Test
    public void solutionTest6(){
        int[] A = {2};
        MissingElement test = new MissingElement();

        assertEquals(1, test.solution(A));
    }

    @Test
    public void solutionTest(){
        int[] A = new int[100000];
        for (int i = 0; i < A.length; i++){
            A[i] = (i + 1);
            if (i + 1 == 100000){
                A[i] = 100001;
            }
        }
        MissingElement test = new MissingElement();
        assertEquals(100000, test.solution(A));
    }

    @Test
    public void solutionTest8(){
        int[] A = {1};
        MissingElement test = new MissingElement();
        assertEquals(2, test.solution(A));
    }

    @Test
    public void solutionTest9(){
        int[] A = {1, 2, 3, 4, 5};
        MissingElement test = new MissingElement();
        assertEquals(6, test.solution(A));
    }

    @Test
    public void solutionTest10(){
        int[] A = {};
        MissingElement test = new MissingElement();
        assertEquals(1, test.solution(A));
    }

    // @Test
    public void arrayTest(){
        int[] A = {1, 2, 3};
        int[] B = Arrays.copyOfRange(A, 3, 7);
        System.out.println(Arrays.toString(B));
        assertTrue(true);
    }
}
