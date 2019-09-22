/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package staffmanagementsystem;

/**
 *
 * @author User
 */
public class details {

    private int id, salary;
    private String name, maritial_status, username, job_title, password;

    public details(int salary, String name, String maritial_status, String username, String job_title, String password) {

        this.salary = salary;
        this.name = name;
        this.maritial_status = maritial_status;
        this.username = username;
        this.job_title = job_title;
        this.password = password;
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

}
