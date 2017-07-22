 
package parkingmeterapp.com.app.models;
/**
 * @author Rafiq on 2017/07/21.
 */
public class DenominatorInnerValues {
    private int quantity;
    private double value;

    public DenominatorInnerValues() {
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public double getValue() {
        return value;
    }

    public void setValue(double value) {
        this.value = value;
    }

    public double calculateTotal()
    {
        double value = (double)this.quantity;
        return (value * this.value);
    }
}
