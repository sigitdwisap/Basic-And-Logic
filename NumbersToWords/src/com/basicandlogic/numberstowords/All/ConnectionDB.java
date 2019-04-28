package com.basicandlogic.numberstowords.All;

import java.sql.*;

class ConnectionDB {

    private Connection connection;
    private Statement statement;

    ConnectionDB() throws ClassNotFoundException, SQLException {
        Class.forName(InsertIntoDB.JDBC_DRIVER);
        this.connection = DriverManager.getConnection(InsertIntoDB.DB_URL, InsertIntoDB.USER, InsertIntoDB.PASS);
        this.statement = this.connection.createStatement();
    }

    ResultSet executeQuery(String query) throws SQLException {
        return this.statement.executeQuery(query);
    }

    void closeConnection() throws SQLException {
        this.connection.close();
    }
}
