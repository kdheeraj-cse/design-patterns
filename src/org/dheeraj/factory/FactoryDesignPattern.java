package org.dheeraj.factory;


// Ask a factory class to create and return the Objects based on some input

public class FactoryDesignPattern {
    public static void main(String[] args) {
        Shape triangleShape = ShapeFactory.getShape("triangle");
        triangleShape.drawShape();

        Shape circleShape = ShapeFactory.getShape("circle");
        circleShape.drawShape();

    }
}
