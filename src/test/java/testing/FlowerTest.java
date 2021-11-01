package testing;

import flowers.*;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class FlowerTest {
    private Flower fl_1 = new Flower();
    private Flower fl_2 = new Flower();
    private FLowerPack fl_pack_1 = new FLowerPack();
    private FLowerPack fl_pack_2 = new FLowerPack();
    private FLowerBucket fl_bucket = new FLowerBucket();
    private Store shop = new Store();
    @org.junit.jupiter.api.BeforeEach
    void setUp() {
        fl_1.setPrice(12.4);
        fl_1.setColor(Color.RED);
        fl_1.setFlowerType(FlowerType.ROSE);

        fl_2.setPrice(9.76);
        fl_2.setColor(Color.WHITE);
        fl_2.setFlowerType(FlowerType.CAMOMILE);

        fl_pack_1.setFlower(fl_1);
        fl_pack_1.setAmount(3);

        fl_pack_2.setAmount(5);
        fl_pack_2.setFlower(fl_2);

        ArrayList<FLowerPack> flowers_pack = new ArrayList();

        flowers_pack.add(fl_pack_2);
        flowers_pack.add(fl_pack_1);
        fl_bucket.setFlowers(flowers_pack);

        ArrayList<Flower> flowers = new ArrayList();

        flowers.add(fl_1);
        flowers.add(fl_2);
        shop.setFlowers(flowers);


        assertEquals(12.4, fl_1.getPrice());
        assertEquals(Color.RED, fl_1.getColor());
    }
    @org.junit.jupiter.api.Test
    void get_pack_price_test(){
        assertEquals(37.2,fl_pack_1.getPrice());
    }
    @org.junit.jupiter.api.Test
    void getFlowerType_test(){
        assertEquals(FlowerType.ROSE, fl_1.getFlowerType());
    }
    @org.junit.jupiter.api.Test
    void get_backet_price_test(){
        assertEquals(86.0,fl_bucket.getPrice());
    }
    @org.junit.jupiter.api.Test
    void store_search_test(){
        Object[] search_parameters = {FlowerType.CAMOMILE};
        assertEquals(1,shop.search(search_parameters).size());
    }
}
