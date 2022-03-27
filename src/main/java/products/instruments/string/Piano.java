package products.instruments.string;

import products.ProductType;
import products.instruments.Instrument;

public class Piano extends Instrument {

    private int numberOfKeys;

    public Piano(ProductType type, int costPrice, int salePrice, String material, String colour, String instrumentType, int numberOfKeys) {
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
