package products;

public abstract class Product implements ISell {

    private int costPrice;
    private int salePrice;

    public Product(int costPrice, int salePrice) {
        this.costPrice = costPrice;
        this.salePrice = salePrice;
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
