package delivery;


import lombok.Getter;
import lombok.Setter;

import java.util.LinkedList;

@Getter
@Setter
public class Order {
    private Payment payment;
    private Delivery delivery;
    private LinkedList<Item> items = new LinkedList();

    public double calculate_total_price(){
        double total_price = 0;
        for (Item item: items){
            total_price += item.getPrice();
        }
        return total_price;
    }

    public void addItem(Item new_item){
        items.add(new_item);
    }

    public void remove_item(Item item){
        if (items.size() > 0 && items.contains(item)){
            items.remove(item);
        }
        else{
            System.out.println("There is no such item.");
        }
    }

    public String process_order(){
        String msg = ("Your order is being processed.");
        return msg;
    }

}
