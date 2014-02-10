package lt.oworks.projecteuler.nproblems;

import lt.oworks.projecteuler.nproblems.impl.Problem44;
import static org.testng.Assert.*;
import org.testng.annotations.Test;

/**
 *
 * @author narkeovi
 */
public class Problem44Test {

    private final long[] numbers = {1, 5, 12, 22, 35, 51, 70, 92, 117, 145, 176, 210, 247, 287, 330, 376, 425, 477, 532, 590, 651, 715, 782, 852, 925, 1001};

    public Problem44Test() {
    }

    @Test
    public void testIsPentagonNumber() {

        for (final long num : numbers) {
            assertTrue(Problem44.isPentagonNumber(num));
        }
        for (final long num : numbers) {
            assertFalse(Problem44.isPentagonNumber(num + 1));
        }
    }

    @Test
    public void testGetPentagonalNumber() {

        for (int i = 1; i <= numbers.length; i++) {
            assertEquals(Problem44.getPentagonalNumber(i), numbers[i - 1]);
        }
    }
}
