/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Person;

import Business.CarInspection.CarInspectionHistory;

/**
 *
 * @author amuly
 */
public class Person {
    
    private int personId;
    private String name;
    private String address;
    private String phoneNo;
    private CarInspectionHistory carInspectionHistory;
    private static int count = 1000;
    
    public Person()
    {
        personId = count;
        count++;
        carInspectionHistory = new CarInspectionHistory();
    }

    public int getPersonId() {
        return personId;
    }

    public void setPersonId(int personId) {
        this.personId = personId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhoneNo() {
        return phoneNo;
    }

    public void setPhoneNo(String phoneNo) {
        this.phoneNo = phoneNo;
    }

    public CarInspectionHistory getCarInspectionHistory() {
        return carInspectionHistory;
    }

    public void setCarInspectionHistory(CarInspectionHistory carInspectionHistory) {
        this.carInspectionHistory = carInspectionHistory;
    }
    
    @Override
    public String toString() {
        return String.valueOf(personId);
    }
        
}
