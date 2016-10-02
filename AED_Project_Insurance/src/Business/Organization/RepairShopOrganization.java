/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Role.InsuranceRole;
import Business.Role.PollutionOfficerRole;
import Business.Role.RepairShopManagerRole;
import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author amuly
 */
public class RepairShopOrganization extends Organization{
 
        public RepairShopOrganization() {
        super(Organization.Type.Repair.getValue());
    }
        
    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList<>();
        roles.add(new RepairShopManagerRole());
        return roles;
    }
}
     
