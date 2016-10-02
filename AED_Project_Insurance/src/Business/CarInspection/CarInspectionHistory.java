/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.CarInspection;

import Business.Person.Person;
import Business.Role.Role;
import Business.UserAccount.UserAccount;
import java.util.ArrayList;

/**
 *
 * @author amuly
 */
public class CarInspectionHistory {
    
    private ArrayList<CarInspection> carInspectionHistory;
    
    public CarInspectionHistory()
    {
        carInspectionHistory = new ArrayList<CarInspection>();
    }

    public ArrayList<CarInspection> getCarInspectionHistory() {
        return carInspectionHistory;
    }

    public void setCarInspectionHistory(ArrayList<CarInspection> carInspectionHistory) {
        this.carInspectionHistory = carInspectionHistory;
    }
    
        public CarInspection createCarInspection(){
        CarInspection carInspection = new CarInspection();
        carInspectionHistory.add(carInspection);
        return carInspection;
    }
      
}
