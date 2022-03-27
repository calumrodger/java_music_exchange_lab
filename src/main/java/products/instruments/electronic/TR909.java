package products.instruments.electronic;

import products.ProductType;
import products.instruments.Instrument;
import products.instruments.InstrumentType;

public class TR909 extends Instrument {

    private int numberOfKnobs;

    public TR909(ProductType type, int costPrice, int salePrice, String material, String colour, InstrumentType instrumentType, int numberOfKnobs) {
        super(type, costPrice, salePrice, material, colour, instrumentType);
        this.numberOfKnobs = numberOfKnobs;
    }

    public int getNumberOfKnobs() {
        return numberOfKnobs;
    }

    public void setNumberOfKnobs(int numberOfKnobs) {
        this.numberOfKnobs = numberOfKnobs;
    }

    public String play(){
        return "unts unts unts";
    }
}
