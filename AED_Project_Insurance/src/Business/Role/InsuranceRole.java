/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Role;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Enterprise.InsuranceEnterprise;
import Business.Network.Network;
import Business.Organization.InsuranceOrganization;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import javax.swing.JPanel;
import userInterface.Insurance.InsuranceWorkAreaJPanel;

/**
 *
 * @author raunak
 */
public class InsuranceRole extends Role{

    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise,Network network, EcoSystem business) {
        return new InsuranceWorkAreaJPanel(userProcessContainer, account, (InsuranceOrganization)organization, (InsuranceEnterprise)enterprise,network);
    }
    
    
}
