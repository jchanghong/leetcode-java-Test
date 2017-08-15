package _212_WordSearchII;

import static com.leetcode.Test.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.junit.After;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.Timeout;

public class SolutionTest {

    /** Test method for {@link _212_WordSearchII.Solution } */
    Solution solution;

    @Rule
    public Timeout globalTimeout = new Timeout(200);

    @Before
    public void setUp() throws Exception {
        solution = new Solution();
    }

    @After
    public void tearDown() throws Exception {
        solution = null;
    }

    @Test
    public void Test1() {
        char[][] board = {
                {'o','a','a','n'}, 
                {'e','t','a','e'}, 
                {'i','h','k','r'}, 
                {'i','f','l','v'} 
        };
        String[] words = {"oath","pea","eat","rain"};
        List<String> actual = solution.findWords(board, words);
        List<String> expected = new ArrayList<>();
        expected.add("oath");
        expected.add("eat");
        Collections.sort(actual);
        Collections.sort(expected);
        assertEqualsIgnoreOrder(expected, actual);
    }

    @Test
    public void Test2() {
        char[][] board = {
                {'a','b'},
                {'a','a'}
        };
        String[] words = {"aba","baa","bab","aaab","aaa","aaaa","aaba"};
        List<String> actual = solution.findWords(board, words);
        List<String> expected = Arrays.asList("aaa","aaab","aaba","aba","baa");
        Collections.sort(actual);
        Collections.sort(expected);
        assertEqualsIgnoreOrder(expected, actual);
    }

}
