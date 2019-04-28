package com.basicandlogic.numberstowords.All;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class InsertIntoDB {

    static final String JDBC_DRIVER = "oracle.jdbc.driver.OracleDriver";
    static final String DB_URL = "jdbc:oracle:thin:@localhost:1521:xe";
    static final String USER = "sigitdwisap"; // set according to your oracle database
    static final String PASS = "sigitdwisap"; // set according to your oracle database
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws SQLException, ClassNotFoundException {
        ConnectionDB connectionDB = new ConnectionDB();
        initializeStartEndNumbers(connectionDB);
        List<String> numbersList = getAllNumbersFromDB(connectionDB);
        connectionDB.closeConnection();
        printAllAngkaToConsole(numbersList);
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

    private static void printAllAngkaToConsole(List<String> numbersList) {
        System.out.println("List of numbers from database, there are " + numbersList.size() + " row(s)");
        for (String number : numbersList) {
            System.out.println(number);
        }
        System.out.println();
    }

    @SuppressWarnings("unchecked")
    private static List<String> getAllNumbersFromDB(ConnectionDB connectionDB) {
        List<String> numberList = new ArrayList();
        try {
            ResultSet resultSet = connectionDB.executeQuery("select id, angka from olah_angka order by id");
            while (resultSet.next()) {
                if (resultSet.getString(2) != null) numberList.add(resultSet.getString(2));
            }
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
        return numberList;
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
