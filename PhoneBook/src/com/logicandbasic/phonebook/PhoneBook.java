package com.logicandbasic.phonebook;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class PhoneBook {

    @SuppressWarnings("unchecked")
    private final List<PhoneNumber> phoneNumbers = new ArrayList();

    PhoneBook(String rawPhoneNumber) {
        List<String> phoneNumbersList = parsePhoneNumbers(rawPhoneNumber);

        System.out.println("=== Output START ===");
        System.out.println("Log:");

        processedToPhoneBook(phoneNumbersList);

        System.out.println();
        System.out.println("Phone book:");

        printAllPhoneNumbers();

        System.out.println("=== Output END ===");
    }

    @SuppressWarnings("unchecked")
    private List<String> parsePhoneNumbers(String rawPhoneNumber) {
        List<String> result = new ArrayList();
        String[] phoneNumbers = rawPhoneNumber.split(";");
        Collections.addAll(result, phoneNumbers);
        return result;
    }

    private void processedToPhoneBook(List<String> phoneNumbersList) {
        for (String phoneNumber : phoneNumbersList) {
            String[] phoneNumberDetails = phoneNumber.split(",");
            PhoneNumber phoneNumberData = new PhoneNumber(phoneNumberDetails[0], phoneNumberDetails[1], phoneNumberDetails[2]);
            if (phoneNumbers.size() > 0) {
                if (checkBeforeInsert(phoneNumberData)) {
                    insertIntoPhoneBook(phoneNumberData);
                } else {
                    printDuplicatePhoneNumber(phoneNumberData);
                }
            } else {
                insertIntoPhoneBook(phoneNumberData);
            }
        }
    }

    private boolean checkBeforeInsert(PhoneNumber phoneNumbersData) {
        boolean result = false;
        for (PhoneNumber phoneNumberData : phoneNumbers) {
            if (phoneNumberData.getNumber().equalsIgnoreCase(phoneNumbersData.getNumber())) {
                result = false;
                break;
            } else {
                result = true;
            }
        }
        return result;
    }

    private void insertIntoPhoneBook(PhoneNumber phoneNumberData) {
        phoneNumbers.add(phoneNumberData);
        System.out.println(phoneNumberData.getFirstName() + " " + phoneNumberData.getLastName() + " - " + phoneNumberData.getNumber() + " : " + "insert success");
    }

    private void printDuplicatePhoneNumber(PhoneNumber phoneNumberData) {
        System.out.println(phoneNumberData.getFirstName() + " " + phoneNumberData.getLastName() + " - " + phoneNumberData.getNumber() + " : " + "duplicate phone number");
    }

    private void printAllPhoneNumbers() {
        int serialNumber = 0;
        for (PhoneNumber phoneNumberData : phoneNumbers) {
            System.out.println(++serialNumber + ". " + phoneNumberData.getFirstName() + " " + phoneNumberData.getLastName() + " - " + phoneNumberData.getNumber());
        }
    }
}
