package org.dheeraj.builder;

public class PhoneBuilder {
    private String os;
    private String ram;
    private String screenSize;
    private String battery;
    private String camera;

    public PhoneBuilder() {

    }

    public PhoneBuilder setOs(String os) {
        this.os = os;
        return this;
    }

    public PhoneBuilder setRam(String ram) {
        this.ram = ram;
        return this;
    }

    public PhoneBuilder setScreenSize(String screenSize) {
        this.screenSize = screenSize;
        return this;
    }

    public PhoneBuilder setBattery(String battery) {
        this.battery = battery;
        return this;
    }

    public PhoneBuilder setCamera(String camera) {
        this.camera = camera;
        return this;
    }

    public Phone build(){
        return new Phone(os,ram,screenSize,battery,camera);
    }
}
