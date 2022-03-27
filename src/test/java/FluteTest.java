import org.junit.Before;
import org.junit.Test;
import products.instruments.wind.Flute;

import static org.junit.Assert.assertEquals;

public class FluteTest {

    Flute flute;

    @Before
    public void setUp(){
        flute = new Flute(10, 40, "acryclic", "black", "wind", 7);
    }

    @Test
    public void canPlay(){
        assertEquals("whistle whistle", flute.play());
    }
}
