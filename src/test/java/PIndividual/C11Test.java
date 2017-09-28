package PIndividual;
import static org.junit.Assert.assertEquals;

import org.junit.Test;

import PIndividual.C11;

public class C11Test {
    
    @Test
    public void testM1() {
        assertEquals("C11: m1",new C11().m1());
    }
    
    @Test
    public void testM2() {
        assertEquals("C11: m2",new C11().m2());
    }
}
