package com.juani.exercises.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class ClientOrders {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/shopping_cart";
        String user = "root";
        String password = "root";

        try (Connection conn = DriverManager.getConnection(url, user, password);
             Statement stmt = conn.createStatement()) {

            String query = "SELECT c.name, COUNT(o.id) AS total_orders " +
                    "FROM Customers c " +
                    "JOIN Orders o ON c.id = o.customer_id " +
                    "GROUP BY c.name";
            ResultSet rs = stmt.executeQuery(query);

            while (rs.next()) {
                System.out.println("Customer: " + rs.getString("name") + ", Total Orders: " + rs.getInt("total_orders"));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
