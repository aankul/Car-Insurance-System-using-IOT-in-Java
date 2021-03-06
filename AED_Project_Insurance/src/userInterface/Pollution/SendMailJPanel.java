/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userInterface.Pollution;

import Business.Enterprise.GovernmentEnterprise;
import Business.Network.Network;
import Business.Organization.PollutionControlOrganization;
import Business.UserAccount.UserAccount;
import Business.WorkQueue.WorkRequest;
import com.sun.xml.internal.org.jvnet.mimepull.MIMEMessage;
import java.awt.CardLayout;
import java.awt.Font;
import java.util.Properties;
import javax.activation.CommandMap;
import javax.activation.MailcapCommandMap;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.*;
import javax.mail.Session;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextArea;

/**
 *
 * @author amuly
 */
public class SendMailJPanel extends javax.swing.JPanel {

    private JPanel userProcessContainer;
    private UserAccount userAccount;
    private WorkRequest workRequest;
    /**
     * Creates new form SendMailJPanel
     */
    public SendMailJPanel(JPanel userProcessContainer,UserAccount userAccount,WorkRequest workRequest) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.userAccount = userAccount;
        this.workRequest = workRequest;
        toTxtField.setText(workRequest.getSender().getPerson().getAddress());
        subjectTxtField.setText("Gas Emission exceeds permissible limit");
        msgTxtField.setText("Hi "+ workRequest.getSender().getPerson().getName()+ 
                "\n This mail is regarding gas emission in your car as recorded on " + workRequest.getRequestDate() + " which exceeds the permissible limit as authorised by the WHO. Please get it fixed to avoid fine.\n\n"
                + "Happy Holidays" + "\nDept of Pollution Control");
        msgTxtField.setWrapStyleWord(true);
        msgTxtField.setLineWrap(true);
    }

    
    
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        toTxtField = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        msgTxtField = new javax.swing.JTextArea();
        sendMailJPanel = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        subjectTxtField = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();

        setBackground(new java.awt.Color(153, 153, 255));

        msgTxtField.setColumns(20);
        msgTxtField.setRows(5);
        jScrollPane1.setViewportView(msgTxtField);

        sendMailJPanel.setText("Send");
        sendMailJPanel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sendMailJPanelActionPerformed(evt);
            }
        });

        jLabel1.setText("TO");

        jLabel2.setText("SUBJECT");

        subjectTxtField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                subjectTxtFieldActionPerformed(evt);
            }
        });

        jLabel3.setText("MESSAGE");

        jLabel4.setFont(new java.awt.Font("Tempus Sans ITC", 0, 24)); // NOI18N
        jLabel4.setText("Send Mail");

        jButton3.setText("Back");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(582, 582, 582)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jButton3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(sendMailJPanel))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 871, Short.MAX_VALUE))
                        .addGap(396, 396, 396))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(toTxtField, javax.swing.GroupLayout.PREFERRED_SIZE, 324, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(35, 35, 35)
                                .addComponent(subjectTxtField, javax.swing.GroupLayout.PREFERRED_SIZE, 324, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel4)
                .addGap(810, 810, 810))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(129, 129, 129)
                .addComponent(jLabel4)
                .addGap(50, 50, 50)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel1)
                    .addComponent(toTxtField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(42, 42, 42)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(subjectTxtField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(55, 55, 55)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(46, 46, 46)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(sendMailJPanel)
                    .addComponent(jButton3))
                .addContainerGap(252, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void sendMailJPanelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sendMailJPanelActionPerformed
        
        
       Properties props = new Properties(); 
       props.put("mail.smtp.host", "smtp.gmail.com"); //SMTP Host
       props.put("mail.smtp.port", "587"); //TLS Port
       props.put("mail.smtp.auth", "true"); //enable authentication
       props.put("mail.smtp.starttls.enable", "true"); //enable STARTTLS
       
       Session session = Session.getDefaultInstance(props,
               new javax.mail.Authenticator() {
                   protected PasswordAuthentication getPasswordAuthentication() {
                       return new PasswordAuthentication("ngaedproject2015@gmail.com", "ngaedproject");
                   }
               });

       try {
           Message message = new MimeMessage(session);
           message.setFrom(new InternetAddress("ngaedproject2015@gmail.com"));
           message.addRecipients(Message.RecipientType.TO, InternetAddress.parse("aancool@gmail.com"));
           message.setSubject(subjectTxtField.getText());
           message.setText(msgTxtField.getText());
           Transport.send(message);
           JOptionPane.showMessageDialog(null, "message sent");
       } catch (Exception e) {
           JOptionPane.showMessageDialog(null, e);
       }
       
       
        // TODO add your handling code here:
    }//GEN-LAST:event_sendMailJPanelActionPerformed

    private void subjectTxtFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_subjectTxtFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_subjectTxtFieldActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer); 
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton3ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea msgTxtField;
    private javax.swing.JButton sendMailJPanel;
    private javax.swing.JTextField subjectTxtField;
    private javax.swing.JTextField toTxtField;
    // End of variables declaration//GEN-END:variables
}
