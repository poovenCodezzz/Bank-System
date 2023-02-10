/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author HP
 */
import com.mysql.jdbc.*;
import java.sql.*;
import javax.swing.JOptionPane;

public class javaConnect {
    Connection conn = null;
    
    public static Connection ConnectDB(){
        try{
            Class.forName("org.sqlite.JDBC");
            Connection conn = DriverManager.getConnection("jdbc:sqlite:C:\\Users\\HP\\OneDrive\\Documents\\NetBeansProjects\\Bank_Management_System\\bank_data.db");
            return conn;
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
        return null;
    }
    
    public static Connection ConnectMySQL(){
        Connection conn = null;

        try {
            // connect way #1
            String url1 = "jdbc:mysql://localhost:3306/bank_management_database";
            String user = "root";
            String password = "";

            conn = DriverManager.getConnection(url1, user, password);
            if (conn != null) {
                System.out.println("Connected to the database ecommerce");

                //Statement stmt = conn.createStatement();   //Creating Statement.
                //Executing Statement.
                // stmt.executeUpdate("create table `ScoreHistory`(`id` integer, `Player1` varchar(20), `Player2` varchar(20), `Score` integer)");
                //stmt.executeUpdate("insert into `Account` values('Pooven', 'poo12')");
                //stmt.executeUpdate("insert into `Account` values(2, 'Black', 'White', 10)");

            }

        } catch (SQLException ex) {
            System.out.println("An error occurred. Maybe user/password is invalid");
            ex.printStackTrace();

        } finally {
            if (conn != null) {
                try {
                    conn.close();
                } catch (Exception ex) {
                    ex.printStackTrace();
                }
            }
        }
        return null;
    }
    
    
}


