package my.basic;

import org.junit.Test;
import static org.junit.Assert.*;

public class TestBurstBalloons {
    BurstBalloons bb = new BurstBalloons();
    @Test
    public void testMaxCoins() {
        assertEquals(167, bb.maxCoins(new int[]{3,1,5,8}));
    }
}

