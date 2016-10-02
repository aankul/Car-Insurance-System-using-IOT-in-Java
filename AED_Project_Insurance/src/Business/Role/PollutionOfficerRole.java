/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Role;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Enterprise.InsuranceEnterprise;
import Business.Enterprise.GovernmentEnterprise;
import Business.Network.Network;
import Business.Organization.Organization;
import Business.Organization.PollutionControlOrganization;
import userInterface.Pollution.PollutionWorkAreaJPanel;
import Business.UserAccount.UserAccount;
import javax.swing.JPanel;

/**
 *
 * @author amuly
 */
public class PollutionOfficerRole extends Role {

    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise,Network network,EcoSystem business) {
        return new PollutionWorkAreaJPanel(userProcessContainer, account, (PollutionControlOrganization)organization, (GovernmentEnterprise)enterprise,network);
    }
    
}
