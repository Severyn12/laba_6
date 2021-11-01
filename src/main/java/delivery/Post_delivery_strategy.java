package delivery;

import java.util.List;

public class Post_delivery_strategy implements Delivery{
    @Override
    public String deliver(List<Item> items) {
        String msg = ("Items will be delivered by post. Items list: " + items);
        return msg;
    }
}
