package com.employees;

import java.sql.Connection;
import java.sql.DriverManager;

public class DatabaseHelper {

    private static final String URL =
            "jdbc:mysql://localhost:3306/employee_db";

    private static final String USER = "root";

    private static final String PASSWORD = "Jnas@2006";

    public static Connection getConnection() {

        try {

            Connection con = DriverManager.getConnection(URL,USER,PASSWORD);

            System.out.println("Database Connected Successfully");

            return con;

        } catch (Exception e) {

            e.printStackTrace();

            return null;

        }

    }

}