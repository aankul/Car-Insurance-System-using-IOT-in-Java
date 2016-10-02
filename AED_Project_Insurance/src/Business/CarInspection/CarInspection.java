/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.CarInspection;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author amuly
 */
public class CarInspection {
    
    private float tyrePressure;
    private float brakingSys;
    private float alignment;
    private float battery;
    private float oilCheck;
    private float pollutionLevel;
    private float lattitude;
    private float longitude;
    private boolean emergency;
    private Date timestamp;

    public boolean isEmergency() {
        return emergency;
    }

    public void setEmergency(boolean emergency) {
        this.emergency = emergency;
    }

    public float getTyrePressure() {
        return tyrePressure;
    }

    public void setTyrePressure(float tyrePressure) {
        this.tyrePressure = tyrePressure;
    }

    public float getBrakingSys() {
        return brakingSys;
    }

    public void setBrakingSys(float brakingSys) {
        this.brakingSys = brakingSys;
    }

    public float getAlignment() {
        return alignment;
    }

    public void setAlignment(float alignment) {
        this.alignment = alignment;
    }

    public float getBattery() {
        return battery;
    }

    public void setBattery(float battery) {
        this.battery = battery;
    }

    public float getOilCheck() {
        return oilCheck;
    }

    public void setOilCheck(float oilCheck) {
        this.oilCheck = oilCheck;
    }

    public float getPollutionLevel() {
        return pollutionLevel;
    }

    public void setPollutionLevel(float pollutionLevel) {
        this.pollutionLevel = pollutionLevel;
    }

    public float getLattitude() {
        return lattitude;
    }

    public void setLattitude(float lattitude) {
        this.lattitude = lattitude;
    }

    public float getLongitude() {
        return longitude;
    }

    public void setLongitude(float longitude) {
        this.longitude = longitude;
    }
    
    public Date getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(Date timestamp) {
        this.timestamp = timestamp;
    }

    
    @Override
    public String toString() {
       SimpleDateFormat ft = new SimpleDateFormat("MM/dd/yyyy 'at' hh:mm:ss a");
       return ft.format(timestamp);
   }
  
}
