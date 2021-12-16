package org.dheeraj.creational.builder;

public class Phone {

    private String os;
    private String ram;
    private String screenSize;
    private String battery;
    private String camera;

    public Phone(String os, String ram, String screenSize, String battery, String camera) {
        this.os = os;
        this.ram = ram;
        this.screenSize = screenSize;
        this.battery = battery;
        this.camera = camera;
    }

    public Phone() {

    }

    public String getOs() {
        return os;
    }

    public void setOs(String os) {
        this.os = os;
    }

    public String getRam() {
        return ram;
    }

    public void setRam(String ram) {
        this.ram = ram;
    }

    public String getScreenSize() {
        return screenSize;
    }

    public void setScreenSize(String screenSize) {
        this.screenSize = screenSize;
    }

    public String getBattery() {
        return battery;
    }

    public void setBattery(String battery) {
        this.battery = battery;
    }

    public String getCamera() {
        return camera;
    }

    public void setCamera(String camera) {
        this.camera = camera;
    }

    @Override
    public String toString() {
        return "Phone{" +
                "os='" + os + '\'' +
                ", ram='" + ram + '\'' +
                ", screenSize='" + screenSize + '\'' +
                ", battery='" + battery + '\'' +
                ", camera='" + camera + '\'' +
                '}';
    }
}
