/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Role.CustomerRole;
import Business.Role.EmergencyRole;
import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author amuly
 */

public class EmergencyOrganization extends Organization{

    public EmergencyOrganization() {
        super(Organization.Type.Emergency.getValue());
    }

    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList<>();
        roles.add(new EmergencyRole());
        return roles;
    }
}