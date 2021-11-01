package testing;

import delivery.Credit_card_payment_strategy;
import delivery.Pay_pal_payment_strategy;
import delivery.Payment;


import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.assertEquals;




public class PaymentTest {
    private Payment card_pay = new Credit_card_payment_strategy();
    private Payment pay_pal_pay = new Pay_pal_payment_strategy();


    @org.junit.jupiter.api.BeforeEach
    void setUp() {

        assertTrue(pay_pal_pay instanceof Pay_pal_payment_strategy);
        assertTrue(pay_pal_pay instanceof Payment);

        assertTrue(card_pay instanceof Credit_card_payment_strategy);
        assertTrue(card_pay instanceof Payment);

    }

    @org.junit.jupiter.api.Test
    void pay_pal_pay_test(){
        assertEquals("Payment will be made by pay pal. You should pay: 34.5",pay_pal_pay.pay(34.5));
    }
    @org.junit.jupiter.api.Test
    void card_pay_test(){
        assertEquals("Payment will be made by pay pal. You should pay: 4.5",pay_pal_pay.pay(4.5));
    }

}
