package org.dheeraj.structural.composite;

public interface Component {

    Integer getPrice();
    void setPrice(Integer price);
    void addComponent(Component component);

}
