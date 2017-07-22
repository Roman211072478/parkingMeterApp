
package parkingmeterapp.com.app.calculations;
import javax.swing.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

/**
 * @author Rafiq on 2017/07/21.
 */
public class CalculateHours {
    public CalculateHours()
    {

    }
    public static long Calculate(JSpinner spinner1,JSpinner spinner2){
           //Comparing 2 dates, in times, which is an int
        long diffHours = 99;
        try {
            //declare a format with the chosen format
            SimpleDateFormat format = new SimpleDateFormat("EE MMM dd HH:mm:ss z yyyy", Locale.ENGLISH);

            //Create date variables for comparison
            Date date1 = format.parse(String.valueOf(spinner1.getValue()));

            Date date2 = format.parse(String.valueOf(spinner2.getValue()));

            return performCalculation(date1,date2);
        }
        catch(ParseException s)
        {

        }
        return diffHours;
    }

    //This is public due to using it for JUint tests
    public static long performCalculation(Date date1,Date date2)
    {
        long diff = Math.abs(date1.getTime() - date2.getTime());
        return (diff / (60 * 60 * 1000));//hours
    }
}
