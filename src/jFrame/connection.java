/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package jFrame;

import java.sql.*;

/**
 *
 * @author LAPTOP
 */
public class connection {
    public static Connection getCon() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/data", "root", "24102004");
            return con;
        } catch (Exception e) {
            System.out.println(e);
            return null;
        }
    }
}
