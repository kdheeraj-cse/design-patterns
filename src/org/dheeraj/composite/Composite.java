package org.dheeraj.composite;

import java.util.List;

public class Composite implements Component{

    private List<Component> list;
    private String name;
    private Integer price;

    public Composite(String name) {
        this.name = name;
    }

    @Override
    public Integer getPrice() {
        list.forEach(
               e -> {
                   price+=e.getPrice();
               }
        );
        return price;
    }

    @Override
    public void addComponent(Component component) {
        list.add(component);
    }
}
