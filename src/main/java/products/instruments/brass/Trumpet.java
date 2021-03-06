package products.instruments.brass;

import products.ProductType;
import products.instruments.Instrument;
import products.instruments.InstrumentType;

public class Trumpet extends Instrument {

    private int numberOfValves;

    public Trumpet(ProductType type, int costPrice, int salePrice, String material, String colour, InstrumentType instrumentType, int numberOfValves) {
        super(type, costPrice, salePrice, material, colour, instrumentType);
        this.numberOfValves = numberOfValves;
    }

    public int getNumberOfValves() {
        return numberOfValves;
    }

    public void setNumberOfValves(int numberOfValves) {
        this.numberOfValves = numberOfValves;
    }

    public String play(){
        return "toot toot";
    }
}
