/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package parkingmeterapp.com.app.components;


import java.util.ArrayList;
import java.util.List;
import parkingmeterapp.com.app.models.DenominatorInnerValues;
import parkingmeterapp.com.app.models.Denominators;

/**
 *
 * @author Rafiq
 */
public class OutputBuilder {
    
    //Add Variables
    private int hours;
    private double amountEntered;
    private double changeAmount;
    //Objects
    private Denominators changeObject;
    //Lists
    private List<DenominatorInnerValues> denominatorsList;
    
    //Constructor
    public OutputBuilder()
    {}

     //** This method is to return a portion of the output,example when 
     //** calculating and choosing amount entered
     public String createFirstPortionString()
    {//Returning a format of the output
        return  "Time:\n"+hours+" hours"+ " and minutes"+"\n"+
                "Your entered:\nR "+amountEntered;
    }
     
      //** This method is to return the second portion of the output,example when 
     //** putting out the change and the denominator
     public String createWholeString()
     {
         return  "Time:\n"+hours+" hours"+ " and minutes"+"\n"+
                "Your entered:\nR "+amountEntered+"\nYour change:\nR "+
                changeAmount+"\n"+
                 //call a method to present the denonators
                 //from object
                filterDenominator();
                                   
     }
     
     /**Setters**/
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
        
        //Below I have stored that data in a list, which will minimize the 
        //lines of code, Where i will use a loop and one if statement...
        //Check method below this one
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
        //This method returns a output result to show the denominators
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
