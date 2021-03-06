/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Pollution;

import Business.Enterprise.Enterprise;
import Business.Enterprise.PollutionEnterprise;
import Business.Network.Network;
import Business.Organization.PollutionControlOrganization;
import Business.UserAccount.UserAccount;
import Business.WorkQueue.WorkRequest;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author amuly
 */
public class ViewPollutionCarsJPanel extends javax.swing.JPanel {

    
    private JPanel userProcessContainer;
    private PollutionControlOrganization organization;
    private PollutionEnterprise enterprise;
    private UserAccount userAccount;
    private Network network;
    
    /**
     * Creates new form ViewPollutionCarsJPanel
     */
    public ViewPollutionCarsJPanel(JPanel userProcessContainer,UserAccount userAccount,PollutionControlOrganization organization,PollutionEnterprise enterprise,Network network) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.organization = organization;
        this.enterprise = enterprise;
        this.userAccount = userAccount;
        this.network = network;
        populateTable();
    }
    
    

     private void populateTable()
    {
        DefaultTableModel model = (DefaultTableModel) pollutionJTable.getModel();

        model.setRowCount(0);
        for (WorkRequest workRequest : enterprise.getWorkQueue().getWorkRequestList()) {
                Object[] row = new Object[4];
                row[0] = workRequest;
                row[1] = workRequest.getStatus();
                row[2] = workRequest.getRequestDate();
                row[3] = workRequest.getCarInspection();
                model.addRow(row);
        }    
    }
 
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        pollutionJTable = new javax.swing.JTable();

        setLayout(new java.awt.BorderLayout());

        jButton1.setText("Back");

        pollutionJTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(pollutionJTable);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(133, 133, 133)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton1)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(139, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(136, 136, 136)
                .addComponent(jButton1)
                .addContainerGap(169, Short.MAX_VALUE))
        );

        add(jPanel1, java.awt.BorderLayout.CENTER);
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable pollutionJTable;
    // End of variables declaration//GEN-END:variables
}
