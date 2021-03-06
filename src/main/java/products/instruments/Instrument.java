package products.instruments;

import products.Product;
import products.ProductType;

public abstract class Instrument extends Product {

    private String material;
    private String colour;
    private InstrumentType instrumentType;

    public Instrument(ProductType type, int costPrice, int salePrice, String material, String colour, InstrumentType instrumentType) {
        super(type, costPrice, salePrice);
        this.material = material;
        this.colour = colour;
        this.instrumentType = instrumentType;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public InstrumentType getInstrumentType() {
        return instrumentType;
    }

    public void setInstrumentType(InstrumentType instrumentType) {
        this.instrumentType = instrumentType;
    }
}
