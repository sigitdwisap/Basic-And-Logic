package com.basicandlogic;

public class InnovaCrysta extends Car {

    public InnovaCrysta(boolean isSedan, String seats) {
        super(isSedan, seats);
    }

    @Override
    public String getMileage() {
        return "10 kmpl";
    }
}
