package org.example;

import java.util.ArrayList;

public class Main {
    public static void showAssortment(ArrayList<Category> as) {
        for (Category c : as) {
            System.out.println(c.toString());
        }
    }

    public static void showAllPurchases(ArrayList<User> ap) {
        System.out.println("Все покупки за день");
        for (User u : ap) {
            System.out.println(u.toString());
        }
    }

    public static void main(String[] args) {

        Product p1 = new Product("rice", 107.9, 4.8);
        Product p2 = new Product("chicken", 225.0, 4.7);
        Product p3 = new Product("buckwheat", 36.5, 4.9);
        Product p4 = new Product("cheese", 545.0, 4.5);
        Product p5 = new Product("lemonade", 56.4, 4.3);
        Product p6 = new Product("butter", 121.0, 4.7);
        Product p7 = new Product("tea", 108.9, 4.6);
        Product p8 = new Product("ham", 318.99, 4.4);
        Product p9 = new Product("beef", 430.0, 4.6);
        Product p10 = new Product("milk", 74.0, 4.8);
        Product p11 = new Product("juice", 101.0, 4.2);

        Category meat = new Category("meat", p2, p8, p9);
        Category groats = new Category("groats", p1, p3);
        Category drink = new Category("drink", p5, p7, p11);
        Category dairy = new Category("dairy", p4, p6, p10);

        ArrayList<Category> assortment = new ArrayList<>();
        assortment.add(meat);
        assortment.add(groats);
        assortment.add(drink);
        assortment.add(dairy);

        System.out.println("Каталог товаров в магазине на начало дня");
        showAssortment(assortment);

        Basket basket1 = new Basket();
        Basket basket2 = new Basket();
        Basket basket3 = new Basket();

        String userChoice1 = "ham";
        meat.choiceProduct(userChoice1, basket1);

        String userChoice2 = "rice";
        groats.choiceProduct(userChoice2, basket2);

        String userChoice3 = "tea";
        drink.choiceProduct(userChoice3, basket3);
        String userChoice4 = "milk";
        dairy.choiceProduct(userChoice4, basket3);

        System.out.println("Каталог товаров в магазине в конце дня");
        showAssortment(assortment);

        User user1 = new User("Helen", "187365df", basket1);
        User user2 = new User("John", "je42fess", basket2);
        User user3 = new User("Mary", "d8gk983", basket3);

        ArrayList<User> allPurchases = new ArrayList<>();
        allPurchases.add(user1);
        allPurchases.add(user2);
        allPurchases.add(user3);

        showAllPurchases(allPurchases);

    }
}