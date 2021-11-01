package decorators;

import delivery.Item;

public class Paper_decorator extends Item_decorator{
    public Paper_decorator(Item item) {
        super(item);

    }

    @Override
    public double getPrice() {
        Item item = super.getItem();
        double total_price = 13 +  item.getPrice();
        return total_price;
    }

}
