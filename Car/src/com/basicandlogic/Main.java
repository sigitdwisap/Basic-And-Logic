package com.basicandlogic;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Car wagonR = new WagonR(false, "4");
        wagonR.printCar("WagonR");

        Car hondaCity = new HondaCity(true, "4");
        hondaCity.printCar("HondaCity");

        Car innovaCrysta = new InnovaCrysta(false, "6");
        innovaCrysta.printCar("InnovaCrysta");
    }
}
