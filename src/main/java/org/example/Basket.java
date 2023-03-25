package org.example;

import java.util.ArrayList;

public class Basket {
    private ArrayList<Product> shoppingList;

    public Basket() {
        this.shoppingList = new ArrayList<>();
    }

    public Basket(Product product) {
        this.shoppingList = new ArrayList<>();
        this.shoppingList.add(product);
    }

    public ArrayList<Product> getShoppingList() {
        return shoppingList;
    }

    public void setShoppingList(ArrayList<Product> shoppingList) {
        this.shoppingList = shoppingList;
    }

    public void setShoppingList(Product product) {
        shoppingList.add(product);
    }

    @Override
    public String toString() {
        return "Basket{" +
                "shoppingList=" + shoppingList.toString() +
                '}';
    }

    public void addProductInBasket(Category c, Product p) {


    }
}
