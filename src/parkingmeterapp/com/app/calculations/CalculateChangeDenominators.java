package parkingmeterapp.com.app.calculations;
 
import parkingmeterapp.com.app.models.Denominators;

/**
 * @author Rafiq on 2017/07/21.
 */
public class CalculateChangeDenominators {



    public CalculateChangeDenominators()
    {

    }

    public Denominators calculate(Double change)
    {
        Denominators object = Denominators.builder()
                .fifthCent(0)
                .fiftyRand(0)
                .fiveRand(0)
                .oneHunderdRand(0)
                .tenRand(0)
                .twoRand(0)
                .twoHunderdRand(0)
                .tenCent(0)
                .twentyCent(0)
                .twentyRand(0)
                .oneRand(0)
                .build();

        return run(object,change.floatValue());
    }

    private Denominators run(Denominators object,float change)
    {
        //logic i created to check from 200 -> 0.1, and to make up the changes

        do {
            if ((change - object.getTwoHunderdRand().getValue()) >= 0) {
                object.getTwoHunderdRand().setQuantity(object.getTwoHunderdRand().getQuantity() + 1);
                change -= object.getTwoHunderdRand().getValue();
                continue;
            } else if ((change - object.getOneHunderdRand().getValue()) >= 0) {
                object.getOneHunderdRand().setQuantity(object.getOneHunderdRand().getQuantity()+1);
                change -= object.getOneHunderdRand().getValue();
                continue;
            } else if ((change - object.getFiftyRand().getValue()) >= 0) {
                object.getFiftyRand().setQuantity(object.getFiftyRand().getQuantity()+1);
                change -= object.getFiftyRand().getValue();
                continue;
            } else if ((change - object.getTwentyRand().getValue()) >= 0) {
                object.getTwentyRand().setQuantity(object.getTwentyRand().getQuantity()+1);
                change -= object.getTwentyRand().getValue();
                continue;
            } else if ((change - object.getTenRand().getValue()) >= 0) {
                object.getTenRand().setQuantity(object.getTenRand().getQuantity()+1);
                change -= object.getTenRand().getValue();
                continue;
            } else if ((change - object.getFiveRand().getValue()) >= 0) {
                object.getFiveRand().setQuantity(object.getFiveRand().getQuantity()+1);
                change -= object.getFiveRand().getValue();
                continue;
            } else if ((change - object.getTwoRand().getValue()) >= 0) {
                object.getTwoRand().setQuantity(object.getTwoRand().getQuantity()+1);
                change -= object.getTwoRand().getValue();
                continue;
            } else if ((change - object.getOneRand().getValue()) >= 0) {
                object.getOneRand().setQuantity(object.getOneRand().getQuantity()+1);
                change -= object.getOneRand().getValue();
                continue;
            } else if ((change - object.getFifthCent().getValue()) >= 0) {
                object.getFifthCent().setQuantity(object.getFifthCent().getQuantity()+1);
                change -= object.getFifthCent().getValue();
                continue;
            } else if ((change - object.getTwentyCent().getValue()) >= 0) {
                object.getTwentyCent().setQuantity(object.getTwentyCent().getQuantity()+1);
                change -= object.getTwentyCent().getValue();
                continue;
            } else if ((change - object.getTenCent().getValue()) >= 0) {
                object.getTenCent().setQuantity(object.getTenCent().getQuantity()+1);
                change -= object.getTenCent().getValue();
                continue;
            } else {
                break;
            }
        }while(true);

        return object;
    }
}
