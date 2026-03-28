package org.practice.designPatterns.structural;

public class AdapterPattern {
    public static void main(String[] args) {
        Adapter adapter = new Adapter();
        adapter.chargeWithNewPhone();
    }
}

class OldCharger {
    public void chargeWithOldPort() {
    }
}

class Adapter{
    OldCharger oldCharger = new OldCharger();

    public void chargeWithNewPhone(){
        oldCharger.chargeWithOldPort();
        System.out.println("Charging with the new port with adapter on it...");
    }
}
