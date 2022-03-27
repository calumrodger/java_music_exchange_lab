package products.instruments.electronic;

import products.instruments.Instrument;

public class TR808 extends Instrument {

    private boolean cowbell;

    public TR808(int costPrice, int salePrice, String material, String colour, String instrumentType, boolean cowbell) {
        super(costPrice, salePrice, material, colour, instrumentType);
        this.cowbell = cowbell;
    }

    public boolean isCowbell() {
        return cowbell;
    }

    public void setCowbell(boolean cowbell) {
        this.cowbell = cowbell;
    }

    public String play(){
        return "cowbell!";
    }
}
