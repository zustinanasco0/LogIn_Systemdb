/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package loginsystem;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class ConexionDB {
    public static Connection getConnection() {
        Connection con = null;
        try {
            // Load Driver
            Class.forName("com.mysql.cj.jdbc.Driver");
            // Connect to your 'user_db' created in XAMPP Shell
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/user_db", "root", "");
        } catch (Exception ex) {
            System.out.println("Connection Failed: " + ex.getMessage());
        }
        return con;
    }
}

