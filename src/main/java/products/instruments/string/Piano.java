package products.instruments.string;

import products.ProductType;
import products.instruments.Instrument;
import products.instruments.InstrumentType;

public class Piano extends Instrument {

    private int numberOfKeys;

    public Piano(ProductType type, int costPrice, int salePrice, String material, String colour, InstrumentType instrumentType, int numberOfKeys) {
        super(type, costPrice, salePrice, material, colour, instrumentType);
        this.numberOfKeys = numberOfKeys;
    }

    public int getNumberOfKeys() {
        return numberOfKeys;
    }

    public void setNumberOfKeys(int numberOfKeys) {
        this.numberOfKeys = numberOfKeys;
    }

    public String play(){
        return "rinky dink";
    }
}
