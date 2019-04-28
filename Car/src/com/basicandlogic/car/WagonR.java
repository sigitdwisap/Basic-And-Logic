package com.basicandlogic.car;

public class WagonR extends Car {

    WagonR(boolean isSedan, String seats) {
        super(isSedan, seats);
    }

    @Override
    public String getMileage() {
        return "20 kmpl";
    }
}
