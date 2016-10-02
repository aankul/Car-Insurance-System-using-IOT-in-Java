/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Role;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Enterprise.GovernmentEnterprise;
import Business.Network.Network;
import Business.Organization.EmergencyOrganization;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import javax.swing.JPanel;
import userInterface.Emergency.EmergencyWorkAreaJPanel;

/**
 *
 * @author amuly
 */

public class EmergencyRole extends Role {

    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise,Network network, EcoSystem business) {
        return new EmergencyWorkAreaJPanel(userProcessContainer, account, (EmergencyOrganization)organization, (GovernmentEnterprise)enterprise,network);
    }
    
}
