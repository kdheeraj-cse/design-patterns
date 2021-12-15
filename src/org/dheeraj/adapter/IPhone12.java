package org.dheeraj.adapter;

public class IPhone12 {

    private IPhoneCharger charger;

    public IPhoneCharger getCharger() {
        return charger;
    }

    public void setCharger(IPhoneCharger charger) {
        this.charger = charger;
    }

    public void chargePhone(){
        charger.doCharge();
    }
}
