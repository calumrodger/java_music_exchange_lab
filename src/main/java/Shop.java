import products.Product;

import java.util.ArrayList;

public class Shop {

    private String name;
    private ArrayList<Product> stock;

    public Shop(String name) {
        this.name = name;
        stock = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<Product> getStock() {
        return stock;
    }

    public void setStock(ArrayList<Product> stock) {
        this.stock = stock;
    }

    public void addToStock(Product product){
        this.stock.add(product);
    }

    public void removeFromStock(Product product){
        this.stock.remove(product);
    }

    public int getStockSize(){
        return this.stock.size();
    }
}
