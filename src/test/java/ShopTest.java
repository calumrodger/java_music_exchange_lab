import org.junit.Before;
import org.junit.Test;
import products.ProductType;
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
        guitar = new Guitar(ProductType.INSTRUMENT, 50, 100, "wood", "red", "string", 6);
        tr909 = new TR909(ProductType.INSTRUMENT,400, 1500, "plastic", "white", "electronic", 40);
        flute = new Flute(ProductType.INSTRUMENT, 10, 40, "acryclic", "black", "wind", 7);
        drumsticks = new Misc(ProductType.DRUMSTICKS, 1, 5);
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
}
