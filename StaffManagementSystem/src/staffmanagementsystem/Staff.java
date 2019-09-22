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
public class Staff extends Users {  //staff inherit from admin

    public Staff(int id, int salary, String name, String maritial_status, String username, String job_title, String password) { //constructor  of superclass
        super(id, salary, name, maritial_status, username, job_title, password);
    }

    Staff() { //constructor

    }
    
    

}
