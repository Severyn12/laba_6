package testing;

import delivery.Delivery;
import delivery.DHL_delivery_strategy;
import delivery.Post_delivery_strategy;
import delivery.Item;
import flowers.Flower;


import java.util.LinkedList;

import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.assertEquals;



public class DeliveryTest {
    private Delivery dlh_delivery = new DHL_delivery_strategy();
    private Delivery post_delivery = new Post_delivery_strategy();
    private LinkedList<Item> items = new LinkedList();


    @org.junit.jupiter.api.BeforeEach
    void setUp() {
        Flower fl_1 = new Flower();
        Flower fl_2 = new Flower();

        fl_1.setPrice(12.5);
        fl_2.setPrice(8.7);

        items.add(fl_1);
        items.add(fl_2);

        assertTrue(dlh_delivery instanceof Delivery);
        assertTrue(dlh_delivery instanceof DHL_delivery_strategy);

        assertTrue(post_delivery instanceof Post_delivery_strategy);
        assertTrue(post_delivery instanceof Delivery);

    }

    @org.junit.jupiter.api.Test
    void DLH_delivery_test(){
        assertEquals("Items will be delivered by DHL. Items list: [Flower(color=null, " +
                "price=12.5, sepalLength=0, flowerType=null), Flower(color=null, price=8.7, " +
                "sepalLength=0, flowerType=null)]",dlh_delivery.deliver(items));
    }
    @org.junit.jupiter.api.Test
    void post_delivery_test(){
        assertEquals("Items will be delivered by post. Items list: [Flower(color=null, " +
                "price=12.5, sepalLength=0, flowerType=null), Flower(color=null, price=8.7, " +
                "sepalLength=0, flowerType=null)]",post_delivery.deliver(items));
    }


}
