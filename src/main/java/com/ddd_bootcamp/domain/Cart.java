package com.ddd_bootcamp.domain;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class Cart {
    private List<Item> items = new ArrayList<>();
    public String CartId;

    public Cart() {
        CartId = UUID.randomUUID().toString();
    }

    public Boolean equals(Cart secondCart) {
        return secondCart.CartId == CartId;
    }


    public void add(Item item) {
        items.add(item);
    }

    public List<Item> getItems() {
        return items;
    }

    public void removeItem(Item item) {
        items.remove(item);
        BusinessInteligence.itemWasRemoved(item);
    }
    @Override
    public String toString() {
        return "Cart{" +
                "items=" + items +
                '}';
    }
}