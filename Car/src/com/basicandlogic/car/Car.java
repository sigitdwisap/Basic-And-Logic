package com.basicandlogic.car;

abstract class Car {
    private final boolean isSedan;
    private final String seats;

    Car(boolean isSedan, String seats) {
        this.isSedan = isSedan;
        this.seats = seats;
    }

    private boolean getIsSedan() {
        return this.isSedan;
    }

    private String getSeats() {
        return this.seats;
    }

    abstract protected String getMileage();

    void printCar(String name) {
        System.out.println(
                "A " + name + " is " + (this.getIsSedan() ? "" : "not ")
                        + "Sedan, is " + this.getSeats() + "-seater, and has a mileage of around "
                        + this.getMileage() + ".");
    }
}
