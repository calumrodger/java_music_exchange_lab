package products.instruments.string;

import products.instruments.IPlay;
import products.instruments.Instrument;

public class Guitar extends Instrument implements IPlay {

    private int numberOfStrings;

    public Guitar(int costPrice, int salePrice, String material, String colour, String instrumentType, int numberOfStrings) {
        super(costPrice, salePrice, material, colour, instrumentType);
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
