package flowers;
import delivery.Item;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;


@Getter @Setter @ToString
public class Flower extends Item {
    public  Color color;
    public double price;
    public int sepalLength;
    private FlowerType flowerType;

}
