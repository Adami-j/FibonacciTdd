import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

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

    @Test
    public void testFiboIterator4() {
        FiboIterator fiboIterator = new FiboIterator(4);
        int resultat = 0;
        while (fiboIterator.hasNext()) {
            resultat= fiboIterator.next();
        }
        assertEquals(3, resultat);
    }

    @Test
    public void testFiboIterator5() {
        FiboIterator fiboIterator = new FiboIterator(5);
        int resultat = 0;
        while (fiboIterator.hasNext()) {
            resultat= fiboIterator.next();
        }
        assertEquals(5, resultat);
    }

    @Test
    public void testFiboIterator6() {
        FiboIterator fiboIterator = new FiboIterator(6);
        int resultat = 0;
        while (fiboIterator.hasNext()) {
            resultat= fiboIterator.next();
        }
        assertEquals(8, resultat);
    }

    @Test
    public void testFiboIterator7() {
        FiboIterator fiboIterator = new FiboIterator(7);
        int resultat = 0;
        while (fiboIterator.hasNext()) {
            resultat= fiboIterator.next();
        }
        assertEquals(13, resultat);
    }

    @Test
    public void testFiboIterator8() {
        FiboIterator fiboIterator = new FiboIterator(8);
        int resultat = 0;
        while (fiboIterator.hasNext()) {
            resultat= fiboIterator.next();
        }
        assertEquals(21, resultat);
    }

    @Test
    public void testFiboIterator9() {
        FiboIterator fiboIterator = new FiboIterator(9);
        int resultat = 0;
        while (fiboIterator.hasNext()) {
            resultat= fiboIterator.next();
        }
        assertEquals(34, resultat);
    }


    @Test
    public void testFiboIterator10() {
        FiboIterator fiboIterator = new FiboIterator(10);
        int resultat = 0;
        while (fiboIterator.hasNext()) {
            resultat= fiboIterator.next();
        }
        assertEquals(55, resultat);
    }

    @Test
    public void testFiboIterator11() {
        FiboIterator fiboIterator = new FiboIterator(11);
        int resultat = 0;
        while (fiboIterator.hasNext()) {
            resultat= fiboIterator.next();
        }
        assertEquals(89, resultat);
    }

    @Test
    public void testFinalFiboIterator() {
        int[] listeFibo = {1,1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, 233, 377, 610, 987, 1597, 2584,
                4181, 6765, 10946, 17711, 28657, 46368, 75025, 121393, 196418, 317811, 514229, 832040, 1346269,
                2178309, 3524578, 5702887, 9227465, 14930352, 24157817, 39088169, 63245986, 102334155, 165580141,
                267914296, 433494437, 701408733, 1134903170};
        int resultat = 0;
        for (int i = 3; i < listeFibo.length; i++) {
            FiboIterator fiboIterator = new FiboIterator(i);
            while (fiboIterator.hasNext()) {
                resultat = fiboIterator.next();
            }
            assertEquals(listeFibo[i], resultat);
        }
    }


}