package products.misc;

import products.ISell;
import products.Product;
import products.ProductType;

public class Misc extends Product implements ISell {

    public Misc(ProductType type, int costPrice, int salePrice) {
        super(type, costPrice, salePrice);
    }

}
