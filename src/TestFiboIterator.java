import org.junit.Test;

import static org.junit.Assert.*;

public class TestFiboIterator {

    @Test
    public void testFiboIteratorHasNext() {
        FiboIterator fiboIterator = new FiboIterator(0);
        assertFalse(fiboIterator.hasNext());
    }

    @Test
    public void testFiboIteratorHasNextTrue() {
        FiboIterator fiboIterator = new FiboIterator(1);
        assertTrue(fiboIterator.hasNext());
    }

    @Test
    public void testFiboIterator0() {
        FiboIterator fiboIterator = new FiboIterator(0);
        assertEquals(0, fiboIterator.next().intValue());
    }


}