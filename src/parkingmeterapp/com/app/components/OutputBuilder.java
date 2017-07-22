/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package parkingmeterapp.com.app.components;

import com.parking.meter.models.Denominators;

/**
 *
 * @author Rafiq
 */
public class OutputBuilder {
    
    private int hours;
    private double amountEntered;
    private double changeAmount;
    private Denominators changeObject;
    
    public OutputBuilder()
    {
           
    }

     public String createFirstPortionString()
    {
        return  "Time:\n"+hours+" hours"+ " and minutes"+"\n"+
                "Your entered:\nR "+amountEntered;
    }
     
     public String createWholeString()
     {
         return  "Time:\n"+hours+" hours"+ " and minutes"+"\n"+
                "Your entered:\nR "+amountEntered+"\nYour change:\nR "+
                changeAmount+"\n"+
                "Denomination:\n"+"R ";
     }
     
     
    public void setHours(int hours) {
        this.hours = hours;
    }

    public void setAmountEntered(double amountEntered) {
        this.amountEntered = amountEntered;
    }

    public void setChangeAmount(double changeAmount) {
        this.changeAmount = changeAmount;
    }

    public void setChangeObject(Denominators changeObject) {
        this.changeObject = changeObject;
    }
    
}
