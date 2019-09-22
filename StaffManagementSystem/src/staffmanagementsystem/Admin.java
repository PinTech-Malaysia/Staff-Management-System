/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package staffmanagementsystem;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author User
 */
public class Admin extends Users {
private boolean result = false;

    public Admin(int id, int salary, String name, String maritial_status, String username, String job_title, String password) {
        super(id, salary, name, maritial_status, username, job_title, password);
    }

Admin(){
    
}
   

//register users method
    public void Add( String username, String fullname, int salary, String position, String password, String status) {
        try {

            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://110.4.45.41:3306/myvoicem_sms", "myvoicem_admin", "Pintechpintech1");

            String sql = "Select * from login where username=?";    
            PreparedStatement pst = con.prepareStatement(sql);
            pst.setString(1, username);
            ResultSet rs = pst.executeQuery();
            if (rs.next()) {    //if username is found in the database
                JOptionPane.showMessageDialog(null, "Username registered exists.");
            } else {
                String sql2 = "INSERT INTO `login`( `name`, `maritial_status`, `salary`, `job_title`, `password`, `username`) VALUES (?,?,?,?,?,?)";
                pst = con.prepareStatement(sql2);
                pst.setString(1, fullname);
                pst.setString(2, status);
                pst.setInt(3, salary);
                pst.setString(4, position);
                pst.setString(5, password);
                pst.setString(6, username);
                pst.execute();
                JOptionPane.showMessageDialog(null, "Register successfully.");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }

//delete users method
    public void delete(int ID) {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://110.4.45.41:3306/myvoicem_sms", "myvoicem_admin", "Pintechpintech1");
            String sql = "DELETE FROM login WHERE ID=? ";   //delete id selected by the admin
            PreparedStatement pst = con.prepareStatement(sql);
            pst.setInt(1, ID);
            pst.executeUpdate();
            JOptionPane.showMessageDialog(null, "User is deleted.");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }


//update users method  
    public void update(String Mstatus, String Jtitle, String Name, int Salary, String Password, String Username) {
        try {
            Class.forName("com.mysql.jdbc.Driver");
             Connection con = DriverManager.getConnection("jdbc:mysql://110.4.45.41:3306/myvoicem_sms", "myvoicem_admin", "Pintechpintech1");
            String sql = "UPDATE login SET name=?, maritial_status=?,salary=?,job_title=?,password=? where username=?"; //update using the value given by the admin
            PreparedStatement pst = con.prepareStatement(sql);
            pst.setString(1, Name);
            pst.setString(2, Mstatus);
            pst.setInt(3, Salary);
            pst.setString(4, Jtitle);
            pst.setString(5, Password);
            pst.setString(6, Username);
            pst.executeUpdate();
            JOptionPane.showMessageDialog(null, "Update Successful.");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }

//search users method
    public ArrayList<SearchDetails> search(String searchName) {

        ArrayList<SearchDetails> search = new ArrayList<>();
        try {
            String mStatus;
            String jTitle;
            int Ssalary;
            int Sid;
            String Sname;
            String Spassword;
            SearchDetails sDetails;

            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://110.4.45.41:3306/myvoicem_sms", "myvoicem_admin", "Pintechpintech1");
            String sql = "Select * from login where username=?";  //search the username get by comparing the value in the database
            PreparedStatement pst = con.prepareStatement(sql);
            pst.setString(1, searchName);
            ResultSet rs = pst.executeQuery();
            if (rs.next()) {
                JOptionPane.showMessageDialog(null, "Search Completed");
                if ("single".equals(rs.getString("maritial_status"))) {
                    mStatus = "single";
                } else {
                    mStatus = "married";
                }
                if ("admin".equals(rs.getString("job_title"))) {
                    jTitle = "admin";
                } else {
                    jTitle = "staff";
                }

                Sid = rs.getInt("ID");
                Ssalary = rs.getInt("salary");
                Sname = rs.getString("name");
                Spassword = rs.getString("password");
                sDetails = new SearchDetails(Sid, Ssalary,Sname,mStatus, jTitle, Spassword);
                search.add(sDetails);
            } else {
                JOptionPane.showMessageDialog(null, "User do not exits. Please re-enter the user name");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
        return search;
    }
}
