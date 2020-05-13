package com.jdbc.day1;

import java.sql.*;

public class InsertAndDeleteTest {

    static String URL = "jdbc:oracle:thin:@3.85.229.252:1521:xe";
    static String username = "hr";
    static String password = "hr";

    public static void main(String[] args) throws SQLException {

        /* Autocloseable version
        String INSERT_QUERY = "INSERT INTO employees VALUES(223, 'Hasan', 'Mammadov', 'hasan@cybertek.com', '777-777-7777', SYSDATE, 'SDET', 14999, 0, NULL, NULL)";
        String DELETE_QUEYR = "DELETE FROM employees WHERE employee_id = 225";

        try (
                Connection connection = DriverManager.getConnection(URL,username, password);
                Statement statement = connection.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
                ResultSet resultSet = statement.executeQuery(INSERT_QUERY);
        ) {

        }

         */

        Connection connection = DriverManager.getConnection(URL, username, password);
        Statement statement = connection.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);

        String INSERT_QUERY = "INSERT INTO employees VALUES(223, 'Hasan', 'Mammadov', 'hasan@cybertek.com', '777-777-7777', SYSDATE, 'SDET', 14999, 0, NULL, NULL)";
        String DELETE_QUEYR = "DELETE FROM employees WHERE employee_id = 225";

        ResultSet resultSet = statement.executeQuery(INSERT_QUERY);

        resultSet.close();
        statement.close();
        connection.close();
    }

}
