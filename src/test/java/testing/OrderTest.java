package testing;

import delivery.*;

import flowers.Flower;

import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.assertEquals;





public class OrderTest {
    private Order order = new Order();
    private Flower fl_1 = new Flower();



    @org.junit.jupiter.api.BeforeEach
    void setUp() {

        Delivery dlh_delivery = new DHL_delivery_strategy();
        Payment card_pay = new Credit_card_payment_strategy();
        order.setDelivery(dlh_delivery);
        order.setPayment(card_pay);

        fl_1.setPrice(15.3);

        assertTrue(order.getDelivery() instanceof Delivery);
        assertTrue(order.getDelivery() instanceof DHL_delivery_strategy);

        assertTrue(order.getPayment() instanceof Credit_card_payment_strategy);
        assertTrue(order.getPayment() instanceof Payment);

    }
    @org.junit.jupiter.api.Test
    void Order_add_item_test(){
        order.addItem(fl_1);
        assertEquals(1,order.getItems().size());
    }

    @org.junit.jupiter.api.Test
    void Order_remove_item_test(){
        order.remove_item(fl_1);
        assertEquals(0,order.getItems().size());
    }

    @org.junit.jupiter.api.Test
    void Order_total_price_test(){
        order.addItem(fl_1);
        assertEquals(15.3,order.calculate_total_price());
    }

    @org.junit.jupiter.api.Test
    void Order_process_test(){
        assertEquals("Your order is being processed.",order.process_order());
    }
}

