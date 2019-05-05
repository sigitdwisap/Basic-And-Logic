package com.logicandbasic.phonebook;

class PhoneNumber {
    private final String firstName;
    private final String lastName;
    private final String number;

    PhoneNumber(String firstName, String lastName, String number) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.number = number;
    }

    String getFirstName() {
        return firstName;
    }

    String getLastName() {
        return lastName;
    }

    String getNumber() {
        return number;
    }
}
