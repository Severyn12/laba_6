package flowers;

import java.util.ArrayList;

import lombok.Getter;


@Getter
public class Store {
    private ArrayList<Flower> flowers = new ArrayList();
    private Filter filter = new Filter();

    public void setFlowers(ArrayList<Flower> flowers_group){
        this.flowers = flowers_group;
    }

    public ArrayList search(Object[] search_parameter) {
        ArrayList<Flower> search_items_fl = flowers;
        if (flowers.size() > 0) {
            for (int i = 0; i < search_parameter.length; i++) {
                if (search_parameter[i] instanceof Color) {
                    search_items_fl = filter.filter_by_color(search_items_fl, (Color) search_parameter[i]);
                }
                else if (search_parameter[i] instanceof FlowerType) {
                    search_items_fl = filter.flower_type_filter(search_items_fl, (FlowerType) search_parameter[i]);
                }
                else{
                    search_items_fl = filter.flower_price_filter(search_items_fl, (double) search_parameter[i]);
                }
            }
        }
        return  search_items_fl;


    }
}
