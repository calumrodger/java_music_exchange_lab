import org.junit.Before;
import org.junit.Test;
import products.instruments.electronic.TR909;

import static org.junit.Assert.assertEquals;

public class TR909Test {

    TR909 tr909;

    @Before
    public void setUp(){
        tr909 = new TR909(400, 1500, "plastic", "white", "electronic", 40);
    }

    @Test
    public void canPlay(){
        assertEquals("unts unts unts", tr909.play());
    }
}
