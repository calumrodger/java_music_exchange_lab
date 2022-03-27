package products;

public abstract class Product implements ISell {

    private ProductType type;
    private int costPrice;
    private int salePrice;

    public Product(ProductType type, int costPrice, int salePrice) {
        this.type = type;
        this.costPrice = costPrice;
        this.salePrice = salePrice;
    }

    public ProductType getType() {
        return type;
    }

    public void setType(ProductType type) {
        this.type = type;
    }

    public int getCostPrice() {
        return costPrice;
    }

    public void setCostPrice(int costPrice) {
        this.costPrice = costPrice;
    }

    public int getSalePrice() {
        return salePrice;
    }

    public void setSalePrice(int salePrice) {
        this.salePrice = salePrice;
    }

    public int calculateMarkup(){
        return salePrice -= costPrice;
    }
}
