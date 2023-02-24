import org.junit.Test;

import static org.junit.Assert.*;

public class TestFiboIterator {


    @Test
    public void testFibo0(){
        FiboIterator fibo = new FiboIterator(0);
        assertEquals(0, fibo.next().intValue());
    }

    @Test
    public void testHasNext() {
        FiboIterator fiboIterator = new FiboIterator(0);
        assertFalse(fiboIterator.hasNext());
    }

    @Test
    public void testFibo1(){
        FiboIterator fibo = new FiboIterator(1);
        fibo.next();

        assertEquals(1,fibo.next().intValue() );
    }

    @Test
    public void testHasNext1() {
        FiboIterator fiboIterator = new FiboIterator(1);
        assertTrue(fiboIterator.hasNext());
    }

    @Test
    public void testHasNext2() {
        FiboIterator fiboIterator = new FiboIterator(2);
        assertTrue(fiboIterator.hasNext());
    }

    @Test
    public void testHasNext3() {
        FiboIterator fiboIterator = new FiboIterator(3);
        assertTrue(fiboIterator.hasNext());
    }

    @Test
    public void testFibo2(){
        FiboIterator fibo = new FiboIterator(2);
        fibo.next();

        assertEquals(2,fibo.next().intValue() );
    }



}
