package org.dheeraj.structural.composite;

public class CompositeDemo {
    public static void main(String[] args) {

        Component keyboard = new Leaf("keyboard", 1000);
        Component mouse = new Leaf("mouse", 500);
        Component monitor = new Leaf("monitor", 20000);
        Component ram = new Leaf("ram", 4000);
        Component cpu = new Leaf("cpu", 13000);


        Component peripheral = new Composite("Peripheral");
        Component motherBoard = new Composite("Motherboard");
        Component computer = new Composite("Computer");

        peripheral.addComponent(keyboard);
        peripheral.addComponent(mouse);
        peripheral.addComponent(monitor);

        motherBoard.addComponent(ram);
        motherBoard.addComponent(cpu);

        computer.addComponent(peripheral);
        computer.addComponent(motherBoard);

        System.out.println("Computer price is "+computer.getPrice());
        System.out.println("Mother board price is "+motherBoard.getPrice());
        System.out.println("Ram price is "+ram.getPrice());

        //setting ram price
       System.out.println("resetting ram price");
       ram.setPrice(5000);

        System.out.println("Computer price is "+computer.getPrice());
        System.out.println("Mother board price is "+motherBoard.getPrice());
        System.out.println("Ram price is "+ram.getPrice());
    }
}
