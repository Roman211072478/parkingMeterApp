
package parkingmeterapp.com.app.calculations;

import parkingmeterapp.com.app.models.Denominators;

/**
 * @author Rafiq on 2017/07/21.
 */
public class CalculateValueOfDenominators {

    private final double amountDue;

    public CalculateValueOfDenominators(double amountDue)
    {
        this.amountDue = amountDue;
    }

    public double denominatorsToAmount(Denominators denominators)
    {
        //this is used just to create a sum of all denominators used
        double total = 0;

        total += denominators.getTenCent().calculateTotal();
        total += denominators.getTwentyCent().calculateTotal();
        total += denominators.getFifthCent().calculateTotal();
        total += denominators.getOneRand().calculateTotal();
        total += denominators.getTwoRand().calculateTotal();
        total += denominators.getFiveRand().calculateTotal();
        total += denominators.getTenRand().calculateTotal();
        total += denominators.getTwentyRand().calculateTotal();
        total += denominators.getFiftyRand().calculateTotal();
        total += denominators.getOneHunderdRand().calculateTotal();
        total += denominators.getTwoHunderdRand().calculateTotal();

        return total;
    }
}
