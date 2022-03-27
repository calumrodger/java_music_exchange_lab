package products.instruments.brass;

import products.instruments.Instrument;

public class Sax extends Instrument {

    private int lengthOfReed;

    public Sax(int costPrice, int salePrice, String material, String colour, String instrumentType, int lengthOfReed) {
        super(costPrice, salePrice, material, colour, instrumentType);
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
