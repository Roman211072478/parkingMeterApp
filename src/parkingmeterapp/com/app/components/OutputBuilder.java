/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package parkingmeterapp.com.app.components;

import com.parking.meter.models.DenominatorInnerValues;
import com.parking.meter.models.Denominators;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Rafiq
 */
public class OutputBuilder {
    
    private int hours;
    private double amountEntered;
    private double changeAmount;
    private Denominators changeObject;
    private List<DenominatorInnerValues> denominatorsList;
    
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
                filterDenominator();
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
        denominatorsList = new ArrayList<>();
        
        this.denominatorsList.add(changeObject.getTwoHunderdRand());
        this.denominatorsList.add(changeObject.getOneHunderdRand());
        this.denominatorsList.add(changeObject.getFiftyRand());
        this.denominatorsList.add(changeObject.getTwentyRand());
        this.denominatorsList.add(changeObject.getTenRand());
        this.denominatorsList.add(changeObject.getFiveRand());
        this.denominatorsList.add(changeObject.getTwoRand());
        this.denominatorsList.add(changeObject.getOneRand());
        this.denominatorsList.add(changeObject.getFifthCent());
        this.denominatorsList.add(changeObject.getTwentyCent());
        this.denominatorsList.add(changeObject.getTenCent());
    }
    
    private String filterDenominator()
    {
        if(this.changeAmount == 0)
        {
            return "";
        }
        String result="Denomination:\n";
            
           for(int x = 0;x<denominatorsList.size();x++){
       
               if (denominatorsList.get(x).getQuantity() > 0) {
                result += "R "+(Math.round(denominatorsList.get(x).getValue() * 100))/100+" x"+denominatorsList.get(x).getQuantity()+"\n";              
               }
           }
        
       return result;  
    }
    
}
