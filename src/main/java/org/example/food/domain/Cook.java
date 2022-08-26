package org.example.food.domain;

import java.util.Objects;

public class Cook {

    private final String name;
    private final int price;

    public Cook(String name, int price) {
        this.name = name;
        this.price = price;
    }

    public Cook(MenuItem menuItem) {
        this.name = menuItem.getName();
        this.price = menuItem.getPrice();
    }

    // 객체들끼리 비교할 땐 equals, hashCode가 있어야 함.
    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof Cook)) {
            return false;
        }
        Cook cook = (Cook) o;
        return Objects.equals(name, cook.name) && price == cook.price;
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, price);
    }

}
