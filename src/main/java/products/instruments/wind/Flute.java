package products.instruments.wind;

import products.instruments.Instrument;

public class Flute extends Instrument {

    private int numberOfHoles;

    public Flute(int costPrice, int salePrice, String material, String colour, String instrumentType, int numberOfHoles) {
        super(costPrice, salePrice, material, colour, instrumentType);
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
