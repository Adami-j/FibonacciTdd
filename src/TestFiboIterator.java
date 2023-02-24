import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;

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



}
