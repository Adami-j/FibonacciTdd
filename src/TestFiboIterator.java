import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;

public class TestFiboIterator {


    @Test
    public void testFibo0(){
        FiboIterator fibo = new FiboIterator(0);
        assertEquals(0, fibo.next().intValue());
    }

}
