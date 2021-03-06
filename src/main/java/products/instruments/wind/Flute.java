package products.instruments.wind;

import products.ProductType;
import products.instruments.Instrument;
import products.instruments.InstrumentType;

public class Flute extends Instrument {

    private int numberOfHoles;

    public Flute(ProductType type, int costPrice, int salePrice, String material, String colour, InstrumentType instrumentType, int numberOfHoles) {
        super(type, costPrice, salePrice, material, colour, instrumentType);
        this.numberOfHoles = numberOfHoles;
    }

    public int getNumberOfHoles() {
        return numberOfHoles;
    }

    public void setNumberOfHoles(int numberOfHoles) {
        this.numberOfHoles = numberOfHoles;
    }

    public String play(){
        return "whistle whistle";
    }
}
