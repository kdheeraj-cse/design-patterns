package org.dheeraj.structural.composite;

import java.util.ArrayList;
import java.util.List;

public class Composite implements Component{

    private List<Component> list = new ArrayList<>();
    private String name;
    private Integer price;

    public Composite(String name) {
        this.name = name;
    }

    @Override
    public Integer getPrice() {
        this.price = 0;
        list.forEach(
               e -> {
                   this.price+=e.getPrice();
               }
        );
        return this.price;
    }

    @Override
    public void setPrice(Integer price) {
        this.price+=price;
    }

    @Override
    public void addComponent(Component component) {
        list.add(component);
    }
}
