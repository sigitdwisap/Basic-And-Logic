package com.basicandlogic.numberstowords.All;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

class UpdateNumbersOnDB {

    public static void main(String[] args) throws SQLException, ClassNotFoundException {
        ConnectionDB connectionDB = new ConnectionDB();
        eliminateMinusFromNumbers(connectionDB);
        List<String> numbersList = ConnectionDB.getAllNumbersFromDB(connectionDB);
        connectionDB.closeConnection();
        ConnectionDB.printAllAngkaToConsole(numbersList);
    }

    private static void eliminateMinusFromNumbers(ConnectionDB connectionDB) throws SQLException {
        int count = 0;
        ResultSet resultSet = connectionDB.executeQuery("select count(*) from olah_angka where angka like \'minus%\'");
        while (resultSet.next()) {
            count = resultSet.getInt(1);
        }
        System.out.println(count + " row(s) updated");
        System.out.println();
        if (count > 0) {
            connectionDB.executeQuery("update olah_angka set angka = substr(angka,7) where angka like \'minus%\'");
        }
    }
}
