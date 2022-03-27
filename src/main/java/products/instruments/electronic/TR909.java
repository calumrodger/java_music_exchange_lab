package products.instruments.electronic;

import products.instruments.Instrument;

public class TR909 extends Instrument {

    private int numberOfKnobs;

    public TR909(int costPrice, int salePrice, String material, String colour, String instrumentType, int numberOfKnobs) {
        super(costPrice, salePrice, material, colour, instrumentType);
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