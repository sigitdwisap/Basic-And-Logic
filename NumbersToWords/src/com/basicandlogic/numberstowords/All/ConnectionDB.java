package com.basicandlogic.numberstowords.All;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

class ConnectionDB {

    private static final String JDBC_DRIVER = "oracle.jdbc.driver.OracleDriver";
    private static final String DB_URL = "jdbc:oracle:thin:@localhost:1521:xe";
    private static final String USER = "sigitdwisap"; // set according to your oracle database
    private static final String PASS = "sigitdwisap"; // set according to your oracle database

    private Connection connection;
    private Statement statement;

    ConnectionDB() throws ClassNotFoundException, SQLException {
        Class.forName(JDBC_DRIVER);
        this.connection = DriverManager.getConnection(DB_URL, USER, PASS);
        this.statement = this.connection.createStatement();
    }

    ResultSet executeQuery(String query) throws SQLException {
        return this.statement.executeQuery(query);
    }

    void closeConnection() throws SQLException {
        this.connection.close();
    }

    @SuppressWarnings("unchecked")
    static List<String> getAllNumbersFromDB(ConnectionDB connectionDB) {
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

    static void printAllAngkaToConsole(List<String> numbersList) {
        System.out.println("List of numbers from database, there are " + numbersList.size() + " row(s) : ");
        System.out.println();
        for (String number : numbersList) {
            System.out.println(number);
        }
        System.out.println();
    }
}
