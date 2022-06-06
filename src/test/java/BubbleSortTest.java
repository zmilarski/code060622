import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class BubbleSortTest {
    @Test
    public void test1() {
        // given (arrange)
        List<Comparable> listTable = Arrays.asList(new Comparable[]{1,4,5,6,8,3,8});
        // when (act)
        List<Comparable> listTable2 = BubbleSort.sort(listTable);
        // then (assert)
        assertEquals(Arrays.asList(new Comparable[]{1,3,4,5,6,8,8}), listTable2);
    }

    @Test
    public void test2() {
        // given (arrange)
        List<Comparable> listTable = Arrays.asList(new Comparable[]{-9.3, 0.2, 4, 0.1, 5, 9});
        // when (act)
        List<Comparable> listTable2 = BubbleSort.sort(listTable);
        // then (assert)
        assertEquals(Arrays.asList(new Comparable[]{-9.3, 0.1, 0.2, 4, 5, 9}), listTable2);
    }

    @Test
    public void test3() {
        // given (arrange)
        List<Comparable> listTable = Arrays.asList(new Comparable[]{});
        // when (act)
        List<Comparable> listTable2 = BubbleSort.sort(listTable);
        // then (assert)
        assertEquals(Arrays.asList(new Comparable[]{}), listTable2);
    }

    @Test
    public void test4() {
        // given (arrange)
        List<Comparable> listTable = Arrays.asList(new Comparable[]{null,5.0001});
        // when (act)
        List<Comparable> listTable2 = BubbleSort.sort(listTable);
        // then (assert)
        assertEquals(Arrays.asList(new Comparable[]{5.0001}), listTable2);
    }

    @Rule
    public ExpectedException thrown = ExpectedException.none();

    @Test
    public void test5() {
        // given (arrange)
        thrown.expect(RuntimeException.class);
        // when (act)
        List<Comparable> listTable = null;
        List<Comparable> listTable2 = BubbleSort.sort(listTable);

    }
}
