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
import java.sql.Statement;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author User
 */
public class AddUser extends javax.swing.JFrame {

    String userName;
    String jobTitle;
    String back;

    /**
     * Creates new form AddUser
     */
    public AddUser() {
        initComponents();
    }

    public AddUser(String username, String jobtitle, String Back) {
        initComponents();
        userName = username;
        jobTitle = jobtitle;
        back = Back;
        showUsers();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        status = new javax.swing.ButtonGroup();
        position = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        usersdetails = new javax.swing.JTable();
        refreshBtn = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        salary = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        single = new javax.swing.JRadioButton();
        staff = new javax.swing.JRadioButton();
        fullname = new javax.swing.JTextField();
        married = new javax.swing.JRadioButton();
        jLabel7 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        password = new javax.swing.JPasswordField();
        jLabel4 = new javax.swing.JLabel();
        username = new javax.swing.JTextField();
        addBtn = new javax.swing.JButton();
        admin = new javax.swing.JRadioButton();
        jLabel1 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        jSeparator4 = new javax.swing.JSeparator();
        clearBtn = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        logoutBtn = new javax.swing.JButton();
        homeBtn = new javax.swing.JButton();
        backBtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(0, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        usersdetails.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Name", "Maritial_Status", "Salary", "Job_Title", "Username", "Password"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        usersdetails.setEnabled(false);
        jScrollPane1.setViewportView(usersdetails);
        if (usersdetails.getColumnModel().getColumnCount() > 0) {
            usersdetails.getColumnModel().getColumn(0).setHeaderValue("ID");
        }

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 48, 690, 490));

        refreshBtn.setBackground(new java.awt.Color(0, 255, 255));
        refreshBtn.setFont(new java.awt.Font("Berlin Sans FB", 0, 18)); // NOI18N
        refreshBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/staffmanagementsystem/Image/refresh.png"))); // NOI18N
        refreshBtn.setBorder(null);
        refreshBtn.setBorderPainted(false);
        refreshBtn.setContentAreaFilled(false);
        refreshBtn.setOpaque(false);
        refreshBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                refreshBtnMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                refreshBtnMouseExited(evt);
            }
        });
        refreshBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                refreshBtnActionPerformed(evt);
            }
        });
        jPanel1.add(refreshBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 10, 30, 30));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 130, 730, 570));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        salary.setFont(new java.awt.Font("Berlin Sans FB", 0, 20)); // NOI18N
        salary.setBorder(null);
        salary.setOpaque(false);
        jPanel2.add(salary, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 190, 185, 35));

        jLabel2.setFont(new java.awt.Font("Berlin Sans FB Demi", 0, 19)); // NOI18N
        jLabel2.setText("Full Name :");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 120, -1, 30));

        jLabel3.setFont(new java.awt.Font("Berlin Sans FB Demi", 0, 19)); // NOI18N
        jLabel3.setText("Salary :");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 200, 70, 30));

        single.setBackground(new java.awt.Color(255, 255, 255));
        status.add(single);
        single.setFont(new java.awt.Font("Berlin Sans FB", 0, 18)); // NOI18N
        single.setText("Single");
        jPanel2.add(single, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 450, -1, -1));

        staff.setBackground(new java.awt.Color(255, 255, 255));
        position.add(staff);
        staff.setFont(new java.awt.Font("Berlin Sans FB", 0, 18)); // NOI18N
        staff.setText("Staff");
        jPanel2.add(staff, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 280, -1, -1));

        fullname.setFont(new java.awt.Font("Berlin Sans FB", 0, 20)); // NOI18N
        fullname.setBorder(null);
        fullname.setOpaque(false);
        jPanel2.add(fullname, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 110, 185, 35));

        married.setBackground(new java.awt.Color(255, 255, 255));
        status.add(married);
        married.setFont(new java.awt.Font("Berlin Sans FB", 0, 18)); // NOI18N
        married.setText("Married");
        jPanel2.add(married, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 450, -1, -1));

        jLabel7.setFont(new java.awt.Font("Berlin Sans FB Demi", 0, 19)); // NOI18N
        jLabel7.setText("Password :");
        jPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 360, 100, -1));

        jLabel5.setFont(new java.awt.Font("Berlin Sans FB Demi", 0, 19)); // NOI18N
        jLabel5.setText("Maritial Status :");
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 450, -1, -1));

        password.setFont(new java.awt.Font("Berlin Sans FB", 0, 20)); // NOI18N
        password.setBorder(null);
        password.setOpaque(false);
        jPanel2.add(password, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 340, 180, 35));

        jLabel4.setFont(new java.awt.Font("Berlin Sans FB Demi", 0, 19)); // NOI18N
        jLabel4.setText("Position :");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 280, -1, -1));

        username.setFont(new java.awt.Font("Berlin Sans FB", 0, 20)); // NOI18N
        username.setBorder(null);
        username.setOpaque(false);
        jPanel2.add(username, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 30, 185, 36));

        addBtn.setFont(new java.awt.Font("Berlin Sans FB", 0, 18)); // NOI18N
        addBtn.setText("Add");
        addBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addBtnActionPerformed(evt);
            }
        });
        jPanel2.add(addBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 520, -1, -1));

        admin.setBackground(new java.awt.Color(255, 255, 255));
        position.add(admin);
        admin.setFont(new java.awt.Font("Berlin Sans FB", 0, 18)); // NOI18N
        admin.setText("Admin");
        jPanel2.add(admin, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 280, -1, -1));

        jLabel1.setFont(new java.awt.Font("Berlin Sans FB Demi", 0, 19)); // NOI18N
        jLabel1.setText("User Name :");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 40, 120, 30));
        jPanel2.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 70, 190, 10));
        jPanel2.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 150, 190, 10));
        jPanel2.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 230, 190, 10));
        jPanel2.add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 380, 190, 10));

        clearBtn.setFont(new java.awt.Font("Berlin Sans FB", 0, 18)); // NOI18N
        clearBtn.setText("Clear");
        clearBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearBtnActionPerformed(evt);
            }
        });
        jPanel2.add(clearBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 520, -1, -1));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 130, 390, 570));

        jPanel3.setBackground(new java.awt.Color(51, 0, 51));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/staffmanagementsystem/Image/addStaff.png"))); // NOI18N
        jPanel3.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 110, 100));

        jLabel8.setFont(new java.awt.Font("Berlin Sans FB", 0, 24)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Add User");
        jPanel3.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 80, 100, -1));

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1120, 130));

        jPanel4.setBackground(new java.awt.Color(51, 0, 51));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        logoutBtn.setFont(new java.awt.Font("Berlin Sans FB", 0, 14)); // NOI18N
        logoutBtn.setForeground(new java.awt.Color(255, 255, 255));
        logoutBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/staffmanagementsystem/Image/logout.png"))); // NOI18N
        logoutBtn.setText("Log Out");
        logoutBtn.setBorder(null);
        logoutBtn.setBorderPainted(false);
        logoutBtn.setContentAreaFilled(false);
        logoutBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                logoutBtnMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                logoutBtnMouseExited(evt);
            }
        });
        logoutBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logoutBtnActionPerformed(evt);
            }
        });
        jPanel4.add(logoutBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(1010, 10, -1, -1));

        homeBtn.setFont(new java.awt.Font("Berlin Sans FB", 0, 14)); // NOI18N
        homeBtn.setForeground(new java.awt.Color(255, 255, 255));
        homeBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/staffmanagementsystem/Image/home.png"))); // NOI18N
        homeBtn.setText("Main Menu");
        homeBtn.setToolTipText("");
        homeBtn.setBorder(null);
        homeBtn.setBorderPainted(false);
        homeBtn.setContentAreaFilled(false);
        homeBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                homeBtnMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                homeBtnMouseExited(evt);
            }
        });
        homeBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                homeBtnActionPerformed(evt);
            }
        });
        jPanel4.add(homeBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 0, 140, -1));

        backBtn.setFont(new java.awt.Font("Berlin Sans FB", 0, 18)); // NOI18N
        backBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/staffmanagementsystem/Image/Back.png"))); // NOI18N
        backBtn.setBorder(null);
        backBtn.setBorderPainted(false);
        backBtn.setContentAreaFilled(false);
        backBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                backBtnMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                backBtnMouseExited(evt);
            }
        });
        backBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backBtnActionPerformed(evt);
            }
        });
        jPanel4.add(backBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        getContentPane().add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 700, 1120, 60));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    //add the user that admin enter to the database
    private void addBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addBtnActionPerformed
        Admin adminAdd = new Admin();
        String Status;
        String pos;
        if (single.isSelected()) {
            Status = "single";
        } else {
            Status = "married";
        }

        if (admin.isSelected()) {
            pos = "admin";
        } else {
            pos = "staff";
        }
        try {
            adminAdd.Add( username.getText(), fullname.getText(), Integer.parseInt(salary.getText()), pos, password.getText(), Status);
            position.clearSelection();
            status.clearSelection();
            fullname.setText("");
            salary.setText("");
            username.setText("");
            password.setText("");
            DefaultTableModel model = (DefaultTableModel) usersdetails.getModel();
            model.setRowCount(0);
            showUsers();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Please enter all of the details");
        }
    }//GEN-LAST:event_addBtnActionPerformed

    private void refreshBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_refreshBtnActionPerformed
        DefaultTableModel model = (DefaultTableModel) usersdetails.getModel();
        model.setRowCount(0);
        showUsers();
    }//GEN-LAST:event_refreshBtnActionPerformed

    private void homeBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_homeBtnActionPerformed
        Homepage home = new Homepage(userName, jobTitle);
        FadeUtilityClass fades = new FadeUtilityClass();
        fades.fade(home, true);
        home.setVisible(true);
        setVisible(false);
    }//GEN-LAST:event_homeBtnActionPerformed

    private void refreshBtnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_refreshBtnMouseEntered
        refreshBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/staffmanagementsystem/Image/refresh1.png")));
    }//GEN-LAST:event_refreshBtnMouseEntered

    private void refreshBtnMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_refreshBtnMouseExited
        refreshBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/staffmanagementsystem/Image/refresh.png")));
    }//GEN-LAST:event_refreshBtnMouseExited

    private void logoutBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logoutBtnActionPerformed
        int dialogButton = JOptionPane.YES_NO_OPTION;
        int dialogResult = JOptionPane.showConfirmDialog(null, "Do you really want to log out?", "Warning", dialogButton);
        if (dialogResult == JOptionPane.YES_OPTION) {
            JOptionPane.showMessageDialog(null, "User Log Out");
            User user = new User();
            FadeUtilityClass fades = new FadeUtilityClass();
            fades.fade(user, true);
            user.setVisible(true);
            setVisible(false);
        }
    }//GEN-LAST:event_logoutBtnActionPerformed

    private void backBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backBtnActionPerformed
        if (back.equals("details")) {
            StaffDetails staff = new StaffDetails(userName, jobTitle);
            FadeUtilityClass fades = new FadeUtilityClass();
            fades.fade(staff, true);
            staff.setVisible(true);
            setVisible(false);
        } else {
            ManageStaff manage = new ManageStaff(userName, jobTitle);
            FadeUtilityClass fades = new FadeUtilityClass();
            fades.fade(manage, true);
            manage.setVisible(true);
            setVisible(false);
        }

    }//GEN-LAST:event_backBtnActionPerformed

    private void homeBtnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_homeBtnMouseEntered
        homeBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/staffmanagementsystem/Image/home1.png")));
    }//GEN-LAST:event_homeBtnMouseEntered

    private void homeBtnMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_homeBtnMouseExited
        homeBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/staffmanagementsystem/Image/home.png")));
    }//GEN-LAST:event_homeBtnMouseExited

    private void logoutBtnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_logoutBtnMouseEntered
        logoutBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/staffmanagementsystem/Image/logout_1.png")));
    }//GEN-LAST:event_logoutBtnMouseEntered

    private void logoutBtnMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_logoutBtnMouseExited
        logoutBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/staffmanagementsystem/Image/logout.png")));
    }//GEN-LAST:event_logoutBtnMouseExited

    private void backBtnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_backBtnMouseEntered
        backBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/staffmanagementsystem/Image/back1.png")));
    }//GEN-LAST:event_backBtnMouseEntered

    private void backBtnMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_backBtnMouseExited
        backBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/staffmanagementsystem/Image/Back.png")));
    }//GEN-LAST:event_backBtnMouseExited

    private void clearBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearBtnActionPerformed
        position.clearSelection();
        status.clearSelection();
        fullname.setText("");
        salary.setText("");
        username.setText("");
        password.setText("");
    }//GEN-LAST:event_clearBtnActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(AddUser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AddUser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AddUser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AddUser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AddUser().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addBtn;
    private javax.swing.JRadioButton admin;
    private javax.swing.JButton backBtn;
    private javax.swing.JButton clearBtn;
    private javax.swing.JTextField fullname;
    private javax.swing.JButton homeBtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JButton logoutBtn;
    private javax.swing.JRadioButton married;
    private javax.swing.JPasswordField password;
    private javax.swing.ButtonGroup position;
    private javax.swing.JButton refreshBtn;
    private javax.swing.JTextField salary;
    private javax.swing.JRadioButton single;
    private javax.swing.JRadioButton staff;
    private javax.swing.ButtonGroup status;
    private javax.swing.JTextField username;
    private javax.swing.JTable usersdetails;
    // End of variables declaration//GEN-END:variables
 public ArrayList<Admin> usersList() {
        ArrayList<Admin> usersList = new ArrayList<>();
        try {
            Class.forName("com.mysql.jdbc.Driver");
           Connection con = DriverManager.getConnection("jdbc:mysql://110.4.45.41:3306/myvoicem_sms", "myvoicem_admin", "Pintechpintech1");
            String sql = "Select * from login ";
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(sql);
            Admin users;
            while (rs.next()) {
                users = new Admin(rs.getInt("ID"), rs.getInt("salary"), rs.getString("name"), rs.getString("maritial_status"), rs.getString("username"), rs.getString("job_title"), rs.getString("password"));
                usersList.add(users);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
        return usersList;
    }

    private void showUsers() {
        ArrayList<Admin> list = usersList();
        DefaultTableModel model = (DefaultTableModel) usersdetails.getModel();
        Object[] row = new Object[7];
        for (int i = 0; i < list.size(); i++) {

            row[0] = list.get(i).getId();
            row[1] = list.get(i).getName();
            row[2] = list.get(i).getMaritial_status();
            row[3] = list.get(i).getSalary();
            row[4] = list.get(i).getJob_title();
            row[5] = list.get(i).getUsername();
           if(list.get(i).getJob_title().equals("admin"))
            {
            row[6] = "****";
            }
            else
            {
            row[6] = list.get(i).getPassword(); 
            }

            model.addRow(row);

        }
    }
}