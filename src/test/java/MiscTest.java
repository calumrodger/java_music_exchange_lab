import org.junit.Before;
import org.junit.Test;
import products.ProductType;
import products.misc.Misc;

import static org.junit.Assert.assertEquals;

public class MiscTest {

    Misc misc1;
    Misc misc2;

    @Before
    public void setUp(){
        misc1 = new Misc(ProductType.DRUMSTICKS, 1, 5);
        misc2 = new Misc(ProductType.SHEETMUSIC, 5, 10);
    }

    @Test
    public void canSell(){
        assertEquals(4, misc1.calculateMarkup());
    }

    @Test
    public void canGetProductType(){
        assertEquals(ProductType.DRUMSTICKS, misc1.getType());
    }
}
