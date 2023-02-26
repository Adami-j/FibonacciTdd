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
        assertEquals(1, fiboIterator.next().intValue());
    }

    @Test
    public void testFiboIterator1() {
        FiboIterator fiboIterator = new FiboIterator(1);
        fiboIterator.next();
        assertEquals(1, fiboIterator.next().intValue());
    }

    @Test
    public void testFiboIterator() {
        FiboIterator fiboIterator = new FiboIterator(2);
        fiboIterator.next();

        assertEquals(1, fiboIterator.next().intValue());
    }

    @Test
    public void testFiboIterator3() {
        FiboIterator fiboIterator = new FiboIterator(3);
        int resultat = 0;
        while (fiboIterator.hasNext()) {
            resultat= fiboIterator.next();
        }
        assertEquals(2, resultat);
    }



}