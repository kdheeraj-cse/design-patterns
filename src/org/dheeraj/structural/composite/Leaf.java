package org.dheeraj.structural.composite;

public class Leaf implements Component{

    private String name;
    private Integer price;

    public Leaf(String name, Integer price) {
        this.name = name;
        this.price = price;
    }

    @Override
    public Integer getPrice() {
        return this.price;
    }

    @Override
    public void setPrice(Integer price) {
        this.price=price;
    }

    @Override
    public void addComponent(Component component) {

    }
}
