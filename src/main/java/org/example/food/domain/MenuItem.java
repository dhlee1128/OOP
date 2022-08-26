package org.example.food.domain;

import java.util.Objects;

public class MenuItem {

    private final String name;
    private final int price;

    public boolean matches(String name) {
        return this.name.equals(name);
    }

    public String getName() {
        return this.name;
    }

    public int getPrice() {
        return this.price;
    }

    public MenuItem(String name, int price) {
        this.name = name;
        this.price = price;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof MenuItem)) {
            return false;
        }
        MenuItem menuItem = (MenuItem) o;
        return Objects.equals(name, menuItem.name) && price == menuItem.price;
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, price);
    }

}
