package flowers;
import delivery.Item;
import lombok.Getter;
import java.util.ArrayList;



@Getter
public class FLowerBucket extends Item {

    private ArrayList<FLowerPack>flowers = new ArrayList();


    public double getPrice(){
        double price = 0;
        for (FLowerPack flower_pack: flowers){
            price += flower_pack.getPrice();

        }

        return price;
    }
    public void setFlowers(ArrayList<FLowerPack> flowers){
        this.flowers = flowers;
    }


}
