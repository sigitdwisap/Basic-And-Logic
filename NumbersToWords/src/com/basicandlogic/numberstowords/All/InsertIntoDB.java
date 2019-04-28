package com.basicandlogic.numberstowords.All;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import java.util.Scanner;

public class InsertIntoDB {

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws SQLException, ClassNotFoundException {
        ConnectionDB connectionDB = new ConnectionDB();
        initializeStartEndNumbers(connectionDB);
        List<String> numbersList = ConnectionDB.getAllNumbersFromDB(connectionDB);
        connectionDB.closeConnection();
        ConnectionDB.printAllAngkaToConsole(numbersList);
    }

    private static void initializeStartEndNumbers(ConnectionDB connectionDB) throws SQLException {
        System.out.print("Using condition (y/n)? ");
        String con = scanner.next();

        boolean isWithCondition = false;
        if (con.equalsIgnoreCase("y")) {
            isWithCondition = true;
        }

        System.out.println();
        System.out.println("Numbers to insert");
        System.out.print("Start : ");
        int startNumber = scanner.nextInt();
        System.out.print("End : ");
        int endNumber = scanner.nextInt();
        saveAllNumbersToDB(connectionDB, SpelledOut.populateStringNumbers(isWithCondition, startNumber, endNumber));
    }

    private static void saveAllNumbersToDB(ConnectionDB connectionDB, List<String> numberList) throws SQLException {
        ResultSet resultSet = connectionDB.executeQuery("select count(*) from olah_angka");
        int id = 0;
        while (resultSet.next()) {
            id = resultSet.getInt(1);
        }
        for (String number : numberList) {
            connectionDB.executeQuery("insert into olah_angka values(" + ++id + ",\'" + number + "\')");
        }
        System.out.println(numberList.size() + " row(s) inserted");
        System.out.println();
    }
}
