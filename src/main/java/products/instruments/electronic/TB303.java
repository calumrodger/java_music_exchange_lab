package products.instruments.electronic;

import products.ProductType;
import products.instruments.Instrument;

public class TB303 extends Instrument {

    private int squlechinessRating;

    public TB303(ProductType type, int costPrice, int salePrice, String material, String colour, String instrumentType, int squlechinessRating) {
        super(type, costPrice, salePrice, material, colour, instrumentType);
        this.squlechinessRating = squlechinessRating;
    }

    public int getSqulechinessRating() {
        return squlechinessRating;
    }

    public void setSqulechinessRating(int squlechinessRating) {
        this.squlechinessRating = squlechinessRating;
    }

    public String play(){
        return "acid squelch";
    }
}
