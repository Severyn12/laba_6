package decorators;

import delivery.Item;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
abstract public class Item_decorator extends Item {
    private Item item;

    public Item_decorator(Item item){
        this.item = item;
    }
}
