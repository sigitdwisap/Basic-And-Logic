package com.basicandlogic;

public class WagonR extends Car {

    public WagonR(boolean isSedan, String seats) {
        super(isSedan, seats);
    }

    @Override
    public String getMileage() {
        return "20 kmpl";
    }
}
