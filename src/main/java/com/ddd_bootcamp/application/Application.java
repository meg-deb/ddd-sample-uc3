package com.ddd_bootcamp.application;

import com.ddd_bootcamp.domain.Cart;
import com.ddd_bootcamp.domain.Item;
import com.ddd_bootcamp.domain.Product;

import java.util.List;

public class Application {
    public static void main(String[] args) {
        Cart cart = new Cart();

        Product headphone = new Product("Sony Wireless headphone");
        Item headphoneItem = new Item(headphone,1);
        cart.add(headphoneItem);

        Cart secondCart = new Cart();
        Product anotherHeadphone = new Product("Sony Wireless headphone");
        Item anotherHeadphoneItem = new Item(anotherHeadphone, 1);
        secondCart.add(anotherHeadphoneItem);

        secondCart.equals(cart);
        System.out.println("--------------------------------------------------------");
        System.out.println("secondCart.equals(cart) = " + secondCart.equals(cart));
        System.out.println("secondCart.equals(secondCart) = " + secondCart.equals(secondCart));

    }
}
