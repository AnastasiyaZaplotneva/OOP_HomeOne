package org.example;

import java.util.ArrayList;
import java.util.Iterator;

public class Category {
    private String categoryName;
    private ArrayList<Product> productList;

    public Category() {
        categoryName = "undefined";
    }


    Category(String categoryName, Product... p) {
        this.productList = new <Product>ArrayList();
        this.categoryName = categoryName;
        for (Product x : p) {
            this.productList.add(x);
        }
    }

    public String getCategoryName() {
        return categoryName;
    }

    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }

    public ArrayList<Product> getProductList() {
        return productList;
    }

    public void setProductList(ArrayList<Product> productList) {
        for (Product x : productList) {
            this.productList.add(x);
        }
    }

    public void setProductList(Product product) {
        this.productList.add(product);
    }

    @Override
    public String toString() {
        return "Category{" +
                "categoryName='" + categoryName + '\'' +
                ", productList=" + productList.toString() +
                '}';
    }

    public void choiceProduct(String userChoice, Basket basket) {
        Product tempProduct = new Product();
        for (Product p : productList) {
            if (p.getName().equals(userChoice)) {
                tempProduct = p;
            }
        }
        basket.setShoppingList(tempProduct);
        productList.remove(tempProduct);

    }
}

