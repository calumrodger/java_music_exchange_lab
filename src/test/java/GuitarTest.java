import org.junit.Before;
import org.junit.Test;
import products.instruments.string.Guitar;

import static org.junit.Assert.assertEquals;

public class GuitarTest {

    Guitar guitar;

    @Before
    public void setUp(){
        guitar = new Guitar(50, 100, "wood", "red", "string", 6);
    }

    @Test
    public void hasSalePrice(){
        assertEquals(100, guitar.getSalePrice());
    }

    @Test
    public void hasStrings(){
        assertEquals(6, guitar.getNumberOfStrings());
    }

    @Test
    public void canPlay(){
        assertEquals("strum strum strum", guitar.play());
    }

    @Test
    public void canCalculateMarkup(){
        assertEquals(50, guitar.calculateMarkup());
    }
}
