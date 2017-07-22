 
package parkingmeterapp.com.app.components;
import javax.swing.*;
import java.util.Date;

/**
 * @author Rafiq on 2017/07/21.
 */
public class DateComponent {

    public DateComponent()
    {
        //constructor
    }

    public static JSpinner create()
    {
        //Create a Date spinner and give a default value and return it
        JSpinner component = new JSpinner( new SpinnerDateModel() );
        JSpinner.DateEditor timeEditor = new JSpinner.DateEditor(component, "yyyy/MM/dd HH:mm:ss");

        component.setEditor(timeEditor);
        component.setValue(new Date());

        return component;
    }
}
