package com.epam.databases;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;

public class SimpleDBPostgres {
    public static void main(String[] args) {
        try {
            Class.forName("org.postgresql.Driver");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        String url = "jdbc:postgresql://localhost:5432/contactdb";
        String user = "postgres";
        String password = "admin";
        String query = "SELECT contact_id id, first_name || ' ' || last_name as name, "
                + "phone, email FROM contacts";
        try (Connection connection = DriverManager.getConnection(url, user, password);
             Statement statement = connection.createStatement();
             ResultSet resultSet = statement.executeQuery(query)) {
//            INSERT ROW
//            resultSet.moveToInsertRow();
//            resultSet.updateString(2, "Linda");
//            resultSet.updateString(3, "Bradley");
//            resultSet.updateString(4, "+3752943546");
//            resultSet.updateString(5, "m.bradley@gmail.com");
//            resultSet.insertRow();
//            resultSet.moveToCurrentRow();
            String outputTableFormat = "| %2s | %-15.15s | %-10.10s | %-18.18s |%n";
            ResultSetMetaData rsmd = resultSet.getMetaData();
            System.out.printf(outputTableFormat, rsmd.getColumnName(1), rsmd.getColumnName(2),
                    rsmd.getColumnName(3), rsmd.getColumnName(4));
            while (resultSet.next()) {
//                UPDATE ROW
//                if (resultSet.getInt(1) == 6) {
//                    String editedNumber = resultSet.getString("phone") + 9;
//                    resultSet.updateString("phone", editedNumber);
//                    resultSet.updateRow();
//                }
                System.out.printf(outputTableFormat, resultSet.getString(1),
                        resultSet.getString(2), resultSet.getString(3),
                        resultSet.getString(4));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
