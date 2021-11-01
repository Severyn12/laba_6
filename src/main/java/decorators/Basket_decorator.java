package decorators;

import delivery.Item;

public class Basket_decorator extends Item_decorator {
    public Basket_decorator(Item item) {
        super(item);

    }

    @Override
    public double getPrice() {
        Item item = super.getItem();
        double total_price = 4 + item.getPrice();
        return total_price;
    }
}