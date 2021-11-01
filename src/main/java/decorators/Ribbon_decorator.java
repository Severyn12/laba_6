package decorators;

import delivery.Item;

public class Ribbon_decorator extends Item_decorator {
    public Ribbon_decorator(Item item) {
        super(item);

    }

    @Override
    public double getPrice() {
        Item item = super.getItem();
        double total_price = 40 + item.getPrice();
        return total_price;
    }
}