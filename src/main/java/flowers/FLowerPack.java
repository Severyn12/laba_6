package flowers;
import delivery.Item;
import lombok.Setter;
import lombok.Getter;


@Getter
@Setter
public class FLowerPack extends Item {
    private Flower flower;
    private int amount;



    public double getPrice(){
        return flower.getPrice() * amount;
    }



}
