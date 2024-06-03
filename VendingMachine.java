package oop;

import java.util.List;

/**
 * VendingMachine
 */
public interface VendingMachine {

    Product getProduct(String name);
    Product getProduct(String name, double volume, int temperature);
    void addProduct(List<Product> productList);
    List<Product> showProducts();


} 

        

