package products.instruments.string;

import products.ProductType;
import products.instruments.IPlay;
import products.instruments.Instrument;
import products.instruments.InstrumentType;

public class Guitar extends Instrument implements IPlay {

    private int numberOfStrings;

    public Guitar(ProductType type, int costPrice, int salePrice, String material, String colour, InstrumentType instrumentType, int numberOfStrings) {
        super(type, costPrice, salePrice, material, colour, instrumentType);
        this.numberOfStrings = numberOfStrings;
    }

    public int getNumberOfStrings() {
        return numberOfStrings;
    }

    public void setNumberOfStrings(int numberOfStrings) {
        this.numberOfStrings = numberOfStrings;
    }

    public String play(){
        return "strum strum strum";
    }
}
