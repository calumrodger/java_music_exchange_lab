package products.instruments.brass;

import products.ProductType;
import products.instruments.Instrument;
import products.instruments.InstrumentType;

public class Sax extends Instrument {

    private int lengthOfReed;

    public Sax(ProductType type, int costPrice, int salePrice, String material, String colour, InstrumentType instrumentType, int lengthOfReed) {
        super(type, costPrice, salePrice, material, colour, instrumentType);
        this.lengthOfReed = lengthOfReed;
    }

    public int getLengthOfReed() {
        return lengthOfReed;
    }

    public void setLengthOfReed(int lengthOfReed) {
        this.lengthOfReed = lengthOfReed;
    }

    public String play(){
        return "hooooorn";
    }
}
