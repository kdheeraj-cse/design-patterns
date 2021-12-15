package org.dheeraj.adapter;

public class AndroidToIphoneAdapter implements IPhoneCharger{

    private OnePlusCharger onePlusCharger = new OnePlusCharger();

    @Override
    public void doCharge() {
        onePlusCharger.chargeAndroidPhone();
    }
}
