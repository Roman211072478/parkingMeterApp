/**
 *  @author Rafiq on 2017/07/21.
 */

package parkingmeterapp.com.app.models;

public class Denominators {
    private DenominatorInnerValues fifthCent;
    private DenominatorInnerValues tenCent;
    private DenominatorInnerValues twentyCent;
    private DenominatorInnerValues oneRand;
    private DenominatorInnerValues twoRand;
    private DenominatorInnerValues fiveRand;
    private DenominatorInnerValues tenRand;
    private DenominatorInnerValues twentyRand;
    private DenominatorInnerValues fiftyRand;
    private DenominatorInnerValues oneHunderdRand;
    private DenominatorInnerValues twoHunderdRand;

    public DenominatorInnerValues getFifthCent() {
        return fifthCent;
    }

    public DenominatorInnerValues getTenCent() {
        return tenCent;
    }

    public DenominatorInnerValues getTwentyCent() {
        return twentyCent;
    }

    public DenominatorInnerValues getOneRand() {
        return oneRand;
    }

    public DenominatorInnerValues getTwoRand() {
        return twoRand;
    }

    public DenominatorInnerValues getFiveRand() {
        return fiveRand;
    }

    public DenominatorInnerValues getTenRand() {
        return tenRand;
    }

    public DenominatorInnerValues getTwentyRand() {
        return twentyRand;
    }

    public DenominatorInnerValues getFiftyRand() {
        return fiftyRand;
    }

    public DenominatorInnerValues getOneHunderdRand() {
        return oneHunderdRand;
    }

    public DenominatorInnerValues getTwoHunderdRand() {
        return twoHunderdRand;
    }

    private Denominators() {

    }

    public Denominators(Builder builder) {

        this.fifthCent = builder.fifthCent;
        this.tenCent = builder.tenCent;
        this.twentyCent = builder.twentyCent;
        this.oneRand = builder.oneRand;
        this.twoRand = builder.twoRand;
        this.fiveRand = builder.fiveRand;
        this.tenRand = builder.tenRand;
        this.twentyRand = builder.twentyRand;
        this.fiftyRand = builder.fiftyRand;
        this.oneHunderdRand = builder.oneHunderdRand;
        this.twoHunderdRand = builder.twoHunderdRand;
    }

    public static class Builder {
        private DenominatorInnerValues fifthCent = new DenominatorInnerValues();
        private DenominatorInnerValues tenCent = new DenominatorInnerValues();
        private DenominatorInnerValues twentyCent = new DenominatorInnerValues();
        private DenominatorInnerValues oneRand = new DenominatorInnerValues();
        private DenominatorInnerValues twoRand = new DenominatorInnerValues();
        private DenominatorInnerValues fiveRand = new DenominatorInnerValues();
        private DenominatorInnerValues tenRand = new DenominatorInnerValues();
        private DenominatorInnerValues twentyRand = new DenominatorInnerValues();
        private DenominatorInnerValues fiftyRand = new DenominatorInnerValues();
        private DenominatorInnerValues oneHunderdRand = new DenominatorInnerValues();
        private DenominatorInnerValues twoHunderdRand = new DenominatorInnerValues();

        public Builder twoHunderdRand(int quantity) {
            this.twoHunderdRand.setValue(200.00);
            this.twoHunderdRand.setQuantity(quantity);
            return this;
        }

        public Builder oneRand(int quantity) {
            this.oneRand.setValue(1.00);
            this.oneRand.setQuantity(quantity);
            return this;
        }
        public Builder twoRand(int quantity) {
            this.twoRand.setValue(2.00);
            this.twoRand.setQuantity(quantity);
            return this;
        }
        public Builder fiveRand(int quantity) {
            this.fiveRand.setValue(5.00);
            this.fiveRand.setQuantity(quantity);
            return this;
        }
        public Builder tenRand(int quantity) {
            this.tenRand.setValue(10.00);
            this.tenRand.setQuantity(quantity);
            return this;
        }
        public Builder twentyRand(int quantity) {
            this.twentyRand.setValue(20.00);
            this.twentyRand.setQuantity(quantity);
            return this;
        }
        public Builder fiftyRand(int quantity) {
            this.fiftyRand.setValue(50.00);
            this.fiftyRand.setQuantity(quantity);
            return this;
        }
        public Builder oneHunderdRand(int quantity) {
            this.oneHunderdRand.setValue(100.00);
            this.oneHunderdRand.setQuantity(quantity);
            return this;
        }
        public Builder twentyCent(int quantity) {
            this.twentyCent.setValue(0.20);
            this.twentyCent.setQuantity(quantity);
            return this;
        }
        public Builder tenCent(int quantity) {
            this.tenCent.setValue(0.10);
            this.tenCent.setQuantity(quantity);
            return this;
        }
        public Builder fifthCent(int quantity) {
            this.fifthCent.setValue(0.50);
            this.fifthCent.setQuantity(quantity);
            return this;
        }

        public Builder copy(Denominators value) {
            this.fifthCent = value.fifthCent;
            this.tenCent = value.tenCent;
            this.twentyCent = value.twentyCent;
            this.oneRand = value.oneRand;
            this.twoRand = value.twoRand;
            this.fiveRand = value.fiveRand;
            this.tenRand = value.tenRand;
            this.twentyRand = value.twentyRand;
            this.fiftyRand = value.fiftyRand;
            this.oneHunderdRand = value.oneHunderdRand;
            this.twoHunderdRand = value.twoHunderdRand;

            return this;
        }

        public Denominators build() {
            return new Denominators(this);
        }
    }

    public static Builder builder() {
        return new Builder();
    }

}

