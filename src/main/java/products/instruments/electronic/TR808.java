package products.instruments.electronic;

import products.ProductType;
import products.instruments.Instrument;
import products.instruments.InstrumentType;

public class TR808 extends Instrument {

    private boolean cowbell;

    public TR808(ProductType type, int costPrice, int salePrice, String material, String colour, InstrumentType instrumentType, boolean cowbell) {
        super(type, costPrice, salePrice, material, colour, instrumentType);
        this.cowbell = cowbell;
    }

    public boolean isCowbell() {
        return cowbell;
    }

    public void setCowbell(boolean cowbell) {
        this.cowbell = cowbell;
    }

    public String play(){
        return "cowbell!";
    }
}
