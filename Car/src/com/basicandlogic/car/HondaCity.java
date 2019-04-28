package com.basicandlogic.car;

public class HondaCity extends Car {

    HondaCity(boolean isSedan, String seats) {
        super(isSedan, seats);
    }

    @Override
    public String getMileage() {
        return "18 kmpl";
    }
}