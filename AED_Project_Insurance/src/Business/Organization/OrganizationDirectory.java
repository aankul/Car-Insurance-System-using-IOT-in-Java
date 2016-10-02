/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Organization.Organization.Type;
import java.util.ArrayList;

/**
 *
 * @author raunak
 */
public class OrganizationDirectory {
    
    private ArrayList<Organization> organizationList;

    public OrganizationDirectory() {
        organizationList = new ArrayList<>();
    }

    public ArrayList<Organization> getOrganizationList() {
        return organizationList;
    }
    
    public Organization createOrganization(Type type){
        Organization organization = null;
        if (type.getValue().equals(Type.Insurance.getValue())){
            organization = new InsuranceOrganization();
            organizationList.add(organization);
        }
        else if (type.getValue().equals(Type.Customer.getValue())){
            organization = new CustomerOrganization();
            organizationList.add(organization);
        }
        else if (type.getValue().equals(Type.Repair.getValue())){
            organization = new RepairShopOrganization();
            organizationList.add(organization);
        }
        else if (type.getValue().equals(Type.Pollution.getValue())){
            organization = new PollutionControlOrganization();
            organizationList.add(organization);
        }
        else if (type.getValue().equals(Type.Emergency.getValue())){
        organization = new EmergencyOrganization();
        organizationList.add(organization);
        }
        return organization;
    }
}