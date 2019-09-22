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
//this class is for the getting the data for the search method
public class SearchDetails {

    private int id, salary;
    private String maritial_status, fullname, job_title, password;

    public SearchDetails(int id, int salary, String maritial_status, String fullname, String job_title, String password) {
        this.id = id;
        this.salary = salary;

        this.maritial_status = maritial_status;
        this.fullname = fullname;
        this.job_title = job_title;
        this.password = password;
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

    public String getMaritial_status() {
        return maritial_status;
    }

    public void setMaritial_status(String maritial_status) {
        this.maritial_status = maritial_status;
    }

    public String getFullname() {
        return fullname;
    }

    public void setFullname(String username) {
        this.fullname = fullname;
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
