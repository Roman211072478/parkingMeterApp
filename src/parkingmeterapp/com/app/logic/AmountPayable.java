 
package parkingmeterapp.com.app.logic;
/**
 * @author Rafiq on 2017/07/21.
 */
public class AmountPayable {
/***
 Logic for how the fees is calculated
 **/
    private AmountPayable(){

    }

    public static int AmountToBePaid(long hours)
    {
        int intHours =99;
        int amount = 99;

        try{

            intHours = (int)hours;

            return checkLogic(intHours);
        }
        catch(ArithmeticException e)
        {
            return 99;
        }

    }

    private static int checkLogic(int hours)
    {
        int value = 99;
        if(hours < 1)
        {
           value = 0;
        }
        else if(hours < 2){
            value = 5;
        }
        else if(hours < 4){
            value = 8;
        }
        else if(hours < 6){
            value = 11;
        }
        else if(hours < 10){
            value = 14;
        }
        else if(hours < 20){
            value = 25;
        }
        else if(hours < 24){
            value = 35;
        }
        else if(hours >= 24){
            value = 50;
        }

        return value;
    }

}
