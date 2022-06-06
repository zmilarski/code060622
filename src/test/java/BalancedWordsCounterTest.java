import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import static org.junit.Assert.assertEquals;

public class BalancedWordsCounterTest {
    @Test
    public void test1() {
        // given (arrange)
        String word = "aabbabcccba";
        // when (act)
        Integer count = BalancedWordsCounter.count(word);
        Integer result = 28;
        // then (assert)
        assertEquals(result, count);
    }

    @Test
    public void test2() {
        // given (arrange)
        String word = "";
        // when (act)
        Integer count = BalancedWordsCounter.count(word);
        Integer result = 0;
        // then (assert)
        assertEquals(result, count);
    }

    @Rule
    public ExpectedException thrown = ExpectedException.none();

    @Test
    public void test3() {
        // given (arrange)
        thrown.expect(RuntimeException.class);
        // when (act)
        String word = "abababa1";
        Integer count = BalancedWordsCounter.count(word);
    }

    @Test
    public void test4() {
        // given (arrange)
        thrown.expect(RuntimeException.class);
        // when (act)
        Integer count = BalancedWordsCounter.count(null);
    }

}
