package _069_Sqrtx;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.Timeout;

public class SolutionTemplateTest {

    /** Test method for {@link _069_Sqrtx.SolutionTemplate } */
    SolutionTemplate solution;

    @Rule
    public Timeout globalTimeout = new Timeout(200);

    @Before
    public void setUp() throws Exception {
        solution = new SolutionTemplate();
    }

    @After
    public void tearDown() throws Exception {
        solution = null;
    }

    @Test
    public void Test1() {
        int x = 4;
        int actual = solution.mySqrt(x);
        int expected = (int) Math.sqrt(x);
        assertEquals(expected, actual);
    }

    @Test
    public void Test2() {
        int x = 1;
        int actual = solution.mySqrt(x);
        int expected = (int) Math.sqrt(x);
        assertEquals(expected, actual);
    }

    @Test
    public void Test3() {
        int x = 9;
        int actual = solution.mySqrt(x);
        int expected = (int) Math.sqrt(x);
        assertEquals(expected, actual);
    }

    @Test
    public void Test4() {
        int x = 5;
        int actual = solution.mySqrt(x);
        int expected = (int) Math.sqrt(x);
        assertEquals(expected, actual);
    }

    @Test
    public void Test5() {
        int x = 2147483647;
        int actual = solution.mySqrt(x);
        int expected = (int) Math.sqrt(x);
        assertEquals(expected, actual);
    }

}
