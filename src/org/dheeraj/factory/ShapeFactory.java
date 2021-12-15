package org.dheeraj.factory;

public class ShapeFactory {
    public static Shape getShape(String specs){
        Shape shape = null;
        switch (specs){
            case "triangle":
                shape = new Triangle();
                break;
            case "circle":
                shape = new Circle();
                break;
            case "rectangle":
                shape = new Rectangle();
                break;
        }
        return shape;
    }
}
