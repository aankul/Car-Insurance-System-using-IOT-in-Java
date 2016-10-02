/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.WorkQueue;

/**
 *
 * @author raunak
 */
public class CarTestWorkRequest extends WorkRequest{
    
    private String testResult;
    private float costOfRepair;

    public float getCostOfRepair() {
        return costOfRepair;
    }

    public void setCostOfRepair(float costOfRepair) {
        this.costOfRepair = costOfRepair;
    }
    
    public String getTestResult() {
        return testResult;
    }

    public void setTestResult(String testResult) {
        this.testResult = testResult;
    }
    
    
}
