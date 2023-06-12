package com.ddd_bootcamp.domain;

import java.util.ArrayList;
import java.util.List;

public class BusinessInteligence {
    static private List<Item> removedItems = new ArrayList<>();

    public static void itemWasRemoved(Item item) {
        removedItems.add(item);
    }

    public static List<Item> showAllRemovedItems() {
        return removedItems;
    }
}
