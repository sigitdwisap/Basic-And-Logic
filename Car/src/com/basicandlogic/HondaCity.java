package com.basicandlogic;

public class HondaCity extends Car {

    public HondaCity(boolean isSedan, String seats) {
        super(isSedan, seats);
    }

    @Override
    public String getMileage() {
        return "18 kmpl";
    }
}