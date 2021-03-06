import org.junit.Before;
import org.junit.Test;
import products.ProductType;
import products.instruments.InstrumentType;
import products.instruments.electronic.TR909;
import products.instruments.string.Guitar;
import products.instruments.wind.Flute;
import products.misc.Misc;

import static org.junit.Assert.assertEquals;

public class ShopTest {

    Guitar guitar;
    Flute flute;
    TR909 tr909;
    Misc drumsticks;
    Shop shop;

    @Before
    public void setUp(){
        guitar = new Guitar(ProductType.INSTRUMENT, 50, 100, "wood", "red", InstrumentType.STRING, 6);
        tr909 = new TR909(ProductType.INSTRUMENT,100, 1000, "plastic", "white", InstrumentType.ELECTRONIC, 40);
        flute = new Flute(ProductType.INSTRUMENT, 10, 60, "acryclic", "black", InstrumentType.WIND, 7);
        drumsticks = new Misc(ProductType.DRUMSTICKS, 10, 20);
        shop = new Shop("happy music");
        shop.addToStock(guitar);
        shop.addToStock(tr909);
        shop.addToStock(flute);
        shop.addToStock(drumsticks);
    }

    @Test
    public void shopHasStock(){
        assertEquals(4, shop.getStockSize());
    }

    @Test
    public void shopCanRemoveFromStock(){
        shop.removeFromStock(drumsticks);
        assertEquals(3, shop.getStockSize());
    }

    @Test
    public void canGetTotalMarkup(){
        assertEquals(1010, shop.calculateTotalMarkup());
    }
}
