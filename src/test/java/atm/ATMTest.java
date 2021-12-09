package atm;

import junit.framework.TestCase;
import org.junit.Test;

public class ATMTest extends TestCase {

    @Test
    public void testProcess() {
        int amount = 125;
        ATM atm = new ATM();
        assertEquals(true, atm.process(amount));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testProcessError() {
        int amount = 126;
        ATM atm = new ATM();

        atm.process(amount);
    }

}