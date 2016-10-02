/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Customers;

import Business.CarInspection.CarInspectionHistory;

/**
 *
 * @author amuly
 */
public class Customer {
    
    private String customerId;
    private int creditCardNo;
    private String customerType;
    private String carType;
    private CarInspectionHistory carInspectionHistory;

    public String getCustomerId() {
        return customerId;
    }

    public void setCustomerId(String customerId) {
        this.customerId = customerId;
    }

    public int getCreditCardNo() {
        return creditCardNo;
    }

    public void setCreditCardNo(int creditCardNo) {
        this.creditCardNo = creditCardNo;
    }

    public String getCustomerType() {
        return customerType;
    }

    public void setCustomerType(String customerType) {
        this.customerType = customerType;
    }

    public String getCarType() {
        return carType;
    }

    public void setCarType(String carType) {
        this.carType = carType;
    }

    public CarInspectionHistory getCarInspectionHistory() {
        return carInspectionHistory;
    }

    public void setCarInspectionHistory(CarInspectionHistory carInspectionHistory) {
        this.carInspectionHistory = carInspectionHistory;
    }

    @Override
    public String toString() {
        return customerId;
    }
    
    
    
}
