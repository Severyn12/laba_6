package testing;

import flowers.*;

import decorators.*;
import delivery.Item;

import java.util.ArrayList;


import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.assertEquals;




public class DecoratorTest {



    private Item fl_bucket = new FLowerBucket();



    private Item_decorator basket_decorator = new Basket_decorator(fl_bucket);
    private Item_decorator paper_decorator = new Paper_decorator(fl_bucket);
    private Item_decorator ribbon_decorator = new Ribbon_decorator(fl_bucket);


    @org.junit.jupiter.api.BeforeEach
    void setUp() {

        Flower fl_1 = new Flower();
        Item fl_pack_1 = new FLowerPack();

        fl_1.setPrice(12.4);
        fl_1.setColor(Color.RED);
        fl_1.setFlowerType(FlowerType.ROSE);

        ((FLowerPack)fl_pack_1).setFlower(fl_1);
        ((FLowerPack)fl_pack_1).setAmount(3);

        ArrayList<FLowerPack> flowers_pack = new ArrayList();
        flowers_pack.add((FLowerPack) fl_pack_1);

        ((FLowerBucket)fl_bucket).setFlowers(flowers_pack);


        assertTrue(basket_decorator instanceof Item_decorator);
        assertTrue(basket_decorator instanceof Basket_decorator);

        assertTrue(paper_decorator instanceof Item_decorator);
        assertTrue(paper_decorator instanceof Paper_decorator);

        assertTrue(ribbon_decorator instanceof Item_decorator);
        assertTrue(ribbon_decorator instanceof Ribbon_decorator);

    }

    @org.junit.jupiter.api.Test
    void Ribbon_dec_getPrice_test(){
        assertEquals(77.2,ribbon_decorator.getPrice());
    }

    @org.junit.jupiter.api.Test
    void Paper_dec_getPrice_test(){
        assertEquals(50.2,paper_decorator.getPrice());
    }

    @org.junit.jupiter.api.Test
    void Basket_dec_getPrice_test(){
        assertEquals(41.2,basket_decorator.getPrice());
    }



}

