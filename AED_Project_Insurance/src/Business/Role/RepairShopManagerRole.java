/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Role;

import Business.EcoSystem;
import Business.Enterprise.CarRepairEnterprise;
import Business.Enterprise.Enterprise;
import Business.Enterprise.InsuranceEnterprise;
import Business.Network.Network;
import Business.Organization.InsuranceOrganization;
import Business.Organization.Organization;
import Business.Organization.RepairShopOrganization;
import userInterface.RepairShopWorkArea.RepairDetailsJPanel;
import Business.UserAccount.UserAccount;
import javax.swing.JPanel;

/**
 *
 * @author amuly
 */
public class RepairShopManagerRole extends Role {

    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise,Network network,EcoSystem business) {
        return new RepairDetailsJPanel(userProcessContainer, account, (RepairShopOrganization)organization, (CarRepairEnterprise)enterprise,network);
    }
    
}
