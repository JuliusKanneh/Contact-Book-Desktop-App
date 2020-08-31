package contactbook;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author owner
 */
public class UI extends javax.swing.JFrame {
    DBHandler dbHandler = new DBHandler();
//    Connection con = dbHandler.getCon(); //facing small problem using this methodology.
    boolean flag = true;
    DefaultTableModel tModel;
    Statement stmt;
    ResultSet myRst;
    String[] data;
    
    /**
     * Creates new form UI
     */
    public UI() {
        initComponents();
        dbHandler.dbConnection();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jFileChooser1 = new javax.swing.JFileChooser();
        jFileChooser2 = new javax.swing.JFileChooser();
        jFileChooser3 = new javax.swing.JFileChooser();
        emptyBorder1 = (javax.swing.border.EmptyBorder)javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1);
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        newContactBtn = new javax.swing.JButton();
        saveBtn = new javax.swing.JButton();
        allContacts = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        contactListTable = new javax.swing.JTable();
        firstName = new javax.swing.JTextField();
        contact = new javax.swing.JTextField();
        homeLine = new javax.swing.JTextField();
        email = new javax.swing.JTextField();
        address = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        photo = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        middleName = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        lastName = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        addEmgCont = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        btn_next = new javax.swing.JButton();
        btn_previous = new javax.swing.JButton();
        btn_delete = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Contact Book");

        jLabel2.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel2.setText("First Name");

        jLabel3.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel3.setText("Contact");

        jLabel4.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel4.setText("Home Line");

        jLabel5.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel5.setText("Email");

        jLabel6.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel6.setText("Address");

        newContactBtn.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        newContactBtn.setText("New Contact");
        newContactBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                newContactBtnActionPerformed(evt);
            }
        });

        saveBtn.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        saveBtn.setText("Save");
        saveBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveBtnActionPerformed(evt);
            }
        });

        allContacts.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        allContacts.setText("All Contact");
        allContacts.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                allContactsActionPerformed(evt);
            }
        });

        contactListTable.setAutoCreateRowSorter(true);
        contactListTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "FIRST NAME", "MIDDLE NAME", "LAST NAME", "CONTACT", "HOME LINE", "EMAIL", "ADRESS", "Emergency Contact"
            }
        ));
        contactListTable.setToolTipText("");
        contactListTable.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        contactListTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                contactListTableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(contactListTable);

        firstName.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        firstName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                firstNameActionPerformed(evt);
            }
        });

        contact.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        contact.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                contactActionPerformed(evt);
            }
        });

        homeLine.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N

        email.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        email.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                emailActionPerformed(evt);
            }
        });

        address.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N

        jLabel7.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel7.setText("Photo");

        jLabel8.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("CONTACT LISTS");

        photo.setBackground(new java.awt.Color(0, 255, 255));
        photo.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        photo.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel9.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel9.setText("Middle Name");

        middleName.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        middleName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                middleNameActionPerformed(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel10.setText("Last Name");

        lastName.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        lastName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lastNameActionPerformed(evt);
            }
        });

        jButton1.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jButton1.setText("Refresh");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel11.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel11.setText("MY CONTACT BOOK");

        addEmgCont.setText("Add Emergency Contact");
        addEmgCont.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addEmgContActionPerformed(evt);
            }
        });

        jButton2.setText("Chose Image");

        btn_next.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/Forward Button_24px.png"))); // NOI18N
        btn_next.setText("Next");
        btn_next.setIconTextGap(10);

        btn_previous.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/Go Back_24px.png"))); // NOI18N
        btn_previous.setText("Previous");
        btn_previous.setIconTextGap(10);

        btn_delete.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/Delete Row_24px.png"))); // NOI18N
        btn_delete.setText("Delete");
        btn_delete.setIconTextGap(10);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButton1)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 98, Short.MAX_VALUE)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, 98, Short.MAX_VALUE)
                                    .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, 98, Short.MAX_VALUE)
                                    .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(14, 14, 14)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(lastName)
                                            .addComponent(firstName)
                                            .addComponent(homeLine)))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(12, 12, 12)
                                        .addComponent(address))))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(addEmgCont)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(btn_previous)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(btn_next)
                                        .addGap(10, 10, 10)
                                        .addComponent(btn_delete)))
                                .addGap(0, 77, Short.MAX_VALUE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, 113, Short.MAX_VALUE))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(middleName))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(10, 10, 10)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(email)
                                            .addComponent(contact)))))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, 113, Short.MAX_VALUE)
                                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(10, 10, 10)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, 191, Short.MAX_VALUE)
                                    .addComponent(photo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(0, 26, Short.MAX_VALUE))))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(newContactBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(saveBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(allContacts, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jScrollPane1))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(jLabel11)
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(firstName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9)
                    .addComponent(middleName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(lastName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(contact, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(homeLine, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel5)
                        .addComponent(email, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(photo, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton2))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(address, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7))
                        .addGap(21, 21, 21)
                        .addComponent(addEmgCont)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btn_delete)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(btn_previous)
                                .addComponent(btn_next)))))
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(newContactBtn)
                    .addComponent(saveBtn)
                    .addComponent(allContacts))
                .addGap(39, 39, 39)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jLabel8))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 231, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void firstNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_firstNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_firstNameActionPerformed

    private void contactActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_contactActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_contactActionPerformed

    private void middleNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_middleNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_middleNameActionPerformed

    private void lastNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lastNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_lastNameActionPerformed

    private void saveBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveBtnActionPerformed
        try {    
            if (flag) {
            
                if (
                        !firstName.getText().equals("") && !middleName.getText().equals("") && 
                        !lastName.getText().equals("") && !contact.getText().equals("") && 
                        !homeLine.getText().equals("") && !email.getText().equals("") && 
                        !address.getText().equals("")
                    ) 
                {
                    String insertQuery = "INSERT INTO contact_book.contact_info "
                            + "(first_name, middle_name, last_name, contact, home_line, email, address) values(?,?,?,?,?,?,?)";
                    PreparedStatement pstmt1 = dbHandler.getCon().prepareStatement(insertQuery);
                    pstmt1.setString(1, firstName.getText());
                    pstmt1.setString(2, middleName.getText());
                    pstmt1.setString(3, lastName.getText());
                    pstmt1.setString(4, contact.getText());
                    pstmt1.setString(5, homeLine.getText());
                    pstmt1.setString(6, email.getText());
                    pstmt1.setString(7, address.getText());
                
                    int ctr = pstmt1.executeUpdate();
                    System.out.println(ctr+" row added successfully");
                    
                    clearFields();
                    JOptionPane.showMessageDialog(rootPane, ctr+" records added successfully");
                    
                    //setting flag to false
//                    flag = false;
                   
                }else{    
                    JOptionPane.showMessageDialog(this, "Please Enter All Fields!");
                }
            
            }else{
                //code to udate record in database from the form
                JOptionPane.showMessageDialog(rootPane, "Set to update record");
                try {
                    String updateQuery = "UPDATE contact_book.contact_info set "
                        + "first_name = ?, "
                        + "middle_name = ?, "
                        + "last_name = ?, "
                        + "contact = ?, "
                        + "home_line = ?, "
                        + "email = ?, "
                        + "address = ? "
                        + "where c_id = ?";
                
                    PreparedStatement updateStatement = dbHandler.getCon().prepareStatement(updateQuery);
                    updateStatement.setString(1, firstName.getText());
                    updateStatement.setString(2, middleName.getText());
                    updateStatement.setString(3, lastName.getText());
                    updateStatement.setString(4, contact.getText());
                    updateStatement.setString(5, homeLine.getText());
                    updateStatement.setString(6, email.getText());
                    updateStatement.setString(7, address.getText());
//                    updateStatement.setInt(8, Integer.parseInt(String.valueOf(c_id.getText())));
                
                    updateStatement.executeUpdate();
                    System.out.println("Working");
                } catch (SQLException ex) {
                    System.out.println("Not working");
                    Logger.getLogger(UI.class.getName()).log(Level.SEVERE, null, ex);
                }
                
//                JOptionPane.showMessageDialog(rootPane, +executeUpdateCount+" Updated successflly");
//                System.out.println("Set to Update Records");
            }
        } catch (SQLException ex) {
            Logger.getLogger(UI.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_saveBtnActionPerformed

    private void newContactBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_newContactBtnActionPerformed
        clearFields();
        
        flag = true;
    }//GEN-LAST:event_newContactBtnActionPerformed

    public void clearFields(){
//        c_id.setText("");
        firstName.setText("");
        middleName.setText("");
        lastName.setText("");
        contact.setText("");
        homeLine.setText("");
        email.setText("");
        address.setText("");
    }
    private void allContactsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_allContactsActionPerformed
        //Avoiding records being query from db every time button is clicked. 
        //Records are being retrieved once due to this logic
        boolean flag = true;
        if(flag){
            viewAllRecord();
        }else{
            System.out.println("Flag is false");
            flag = false;
        }
        flag = false;
    }//GEN-LAST:event_allContactsActionPerformed

    public void viewAllRecord(){
        try {
            String rstQuery1 = "select * from contact_book.contact_info";
            stmt = dbHandler.getCon().createStatement();
            myRst = stmt.executeQuery(rstQuery1);
                        
            while (myRst.next()) {
                data = new String[]{
                    String.valueOf(myRst.getInt(1)),
                    myRst.getString(2), 
                    myRst.getString(3),
                    myRst.getString(4),
                    myRst.getString(5),
                    myRst.getString(6),
                    myRst.getString(7),
                    myRst.getString(8)
                };
                
               
                System.out.println(data[0] + " " + data[1]);
                
                //Creating tableModel and adding rows to it
                tModel = (DefaultTableModel)contactListTable.getModel();
                tModel.addRow(data);
                
//                String rstQuery2 = "select phone from contact_book.emergency_contact";
//                Statement stmt2 = dbHandler.getCon().createStatement();
//                ResultSet myRst2 = stmt2.executeQuery(rstQuery2);
//                
//                while (myRst.next()) {
//                    myRst2.getString(4);
//                }

                
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(UI.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        //clear the table 
        //run the select all query
//        tModel.removeRow();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void addEmgContActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addEmgContActionPerformed
        // TODO add your handling code here:
        AddEmergencyContact obj = new AddEmergencyContact();
        obj.setVisible(true);
    }//GEN-LAST:event_addEmgContActionPerformed

    private void contactListTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_contactListTableMouseClicked
        flag = false;
        boolean editing = contactListTable.isEditing();
        
        if (editing==false) {
            //write code here to display row in the form for editing.
            
            int rowCount = contactListTable.getSelectedRow(); //getting RowCount and saving it in int variable rowCount (+1 is used to increment result)
            int rowCount1 = rowCount+1;
//            int selectedColumn = contactListTable.getSelectedColumn();//not needed now
            System.out.println(rowCount);
//            System.out.println(selectedColumn); //not needed now
                //count starts from 0; id is not needed here that's why it is not called here.
                firstName.setText(tModel.getValueAt(rowCount,1).toString());
                middleName.setText(tModel.getValueAt(rowCount,2).toString());
                lastName.setText(tModel.getValueAt(rowCount,3).toString());
                contact.setText(tModel.getValueAt(rowCount,4).toString());
                homeLine.setText(tModel.getValueAt(rowCount,5).toString());
                email.setText(tModel.getValueAt(rowCount,6).toString());
                address.setText(tModel.getValueAt(rowCount,7).toString());
//                tModel.setValueAt(data, rowCount, 0); //use this to set the emergency contact id in its column

            JOptionPane.showMessageDialog(null, " row # "+rowCount1+" selected.");
        }
    }//GEN-LAST:event_contactListTableMouseClicked

    private void emailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_emailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_emailActionPerformed

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
            java.util.logging.Logger.getLogger(UI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(UI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(UI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(UI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new UI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addEmgCont;
    private javax.swing.JTextField address;
    private javax.swing.JButton allContacts;
    private javax.swing.JButton btn_delete;
    private javax.swing.JButton btn_next;
    private javax.swing.JButton btn_previous;
    private javax.swing.JTextField contact;
    private javax.swing.JTable contactListTable;
    private javax.swing.JTextField email;
    private javax.swing.border.EmptyBorder emptyBorder1;
    private javax.swing.JTextField firstName;
    private javax.swing.JTextField homeLine;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JFileChooser jFileChooser1;
    private javax.swing.JFileChooser jFileChooser2;
    private javax.swing.JFileChooser jFileChooser3;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField lastName;
    private javax.swing.JTextField middleName;
    private javax.swing.JButton newContactBtn;
    private javax.swing.JLabel photo;
    private javax.swing.JButton saveBtn;
    // End of variables declaration//GEN-END:variables
}
