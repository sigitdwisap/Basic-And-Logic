package com.basicandlogic.car;

public class InnovaCrysta extends Car {

    InnovaCrysta(boolean isSedan, String seats) {
        super(isSedan, seats);
    }

    @Override
    public String getMileage() {
        return "10 kmpl";
    }
}
