package delivery;

import java.util.List;

public class DHL_delivery_strategy implements Delivery{
    @Override
    public String deliver(List<Item> items) {

        String msg = ("Items will be delivered by DHL. Items list: " + items);

        return msg;
    }
}
