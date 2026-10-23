package dev.aliideveloper;
import java.util.ArrayList;
import java.util.List;
public class Cart {


    private final List<Product> products=new ArrayList<>();

    public void addProduct(Product p){
        products.add(p);
    }

    public double total(){
        double total=0;

        for (Product product : products){
            total+=product.getPrice();
        }
        return total;
    }





}
//