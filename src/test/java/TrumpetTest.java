import org.junit.Before;
import org.junit.Test;
import products.ProductType;
import products.instruments.brass.Trumpet;

import static org.junit.Assert.assertEquals;

public class TrumpetTest {

    Trumpet trumpet;

    @Before
    public void setUp(){
        trumpet = new Trumpet(ProductType.INSTRUMENT,50, 200, "metal", "gold", "brass", 5);
    }

    @Test
    public void canPlay(){
        assertEquals("toot toot", trumpet.play());
    }
}
