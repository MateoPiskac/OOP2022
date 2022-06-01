package hr.fer.oop.labos.Prvi;

import hr.fer.oop.labos.Prvi.Artikl;
import hr.fer.oop.labos.Prvi.Type;

import static java.lang.Math.round;

class Items<itemType> extends Artikl {
    private double quantity = 0;

    public Items(Object tag, double pricing, Type type) {
        super(tag, pricing, type);
    }

    @Override
    public void setQuantity(double quantity) {
        if (getType() == Type.ITEM) {
            if (quantity < 0) {
                throw new IllegalArgumentException("Negative values forbidden");
            }
            if (quantity - round(quantity) != 0) {
                throw new IllegalArgumentException("For pricing per item, the quantity cannot have decimals");
            } else
                this.quantity = quantity;
        } else
            this.quantity = quantity / 1000;
    }

    @Override
    public double getPrice() {
        return getPricing() * quantity;
    }
}
