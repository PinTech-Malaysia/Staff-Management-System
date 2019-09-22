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
public class Users {
    private int id, salary; //attributes of admin class
    private String name, maritial_status, username, job_title, password;
    private boolean result = false;

    public Users(int id, int salary, String name, String maritial_status, String username, String job_title, String password) {
        this.id = id;
        this.salary = salary;
        this.name = name;
        this.maritial_status = maritial_status;
        this.username = username;
        this.job_title = job_title;
        this.password = password;
    }
    
    Users(){
        
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMaritial_status() {
        return maritial_status;
    }

    public void setMaritial_status(String maritial_status) {
        this.maritial_status = maritial_status;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getJob_title() {
        return job_title;
    }

    public void setJob_title(String job_title) {
        this.job_title = job_title;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    //login
 public boolean login(String userName, String password, String jobTitle) {

        try {
            Class.forName("com.mysql.jdbc.Driver");
             Connection con = DriverManager.getConnection("jdbc:mysql://110.4.45.41:3306/myvoicem_sms", "myvoicem_admin", "Pintechpintech1");
            String sql = "Select * from login where username=? and password=? and job_title=?";
            PreparedStatement pst = con.prepareStatement(sql);
            pst.setString(1, userName);
            pst.setString(2, password);
            pst.setString(3, jobTitle);
            ResultSet rs = pst.executeQuery();
            if (rs.next()) {

                result = true;
            } else {

                result = false;
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }

        return result;
    }
   
 //view profile method 
     public ArrayList<details> viewProfile(String userName) {

        ArrayList<details> profile = new ArrayList<>();  //create a array list name profile
        try {
           Connection con = DriverManager.getConnection("jdbc:mysql://110.4.45.41:3306/myvoicem_sms", "myvoicem_admin", "Pintechpintech1");
            String sql = "Select * from login where username=?";
            PreparedStatement pst = con.prepareStatement(sql);
            details detail;
            pst.setString(1, userName);
            ResultSet rs = pst.executeQuery();
            if (rs.next()) {
                detail = new details(rs.getInt("salary"), rs.getString("name"), rs.getString("maritial_status"), rs.getString("username"), rs.getString("job_title"), rs.getString("password"));  //use the object of the class detail to get the value needed
                profile.add(detail); //put the value taken in the array list profile
            } else {
                JOptionPane.showMessageDialog(null, "ERROR");
            }
        } catch (SQLException ex) {
            Logger.getLogger(ManageStaff.class.getName()).log(Level.SEVERE, null, ex);
        }
        return profile;
    }
    
 
 
}
