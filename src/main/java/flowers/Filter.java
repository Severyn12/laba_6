package flowers;

import java.util.ArrayList;

public class Filter {
    public ArrayList filter_by_color(ArrayList<Flower> item_array, Color color){
        ArrayList<Flower> find_obj = new ArrayList<Flower>();
        for (Flower flower: item_array){
            if (flower.getColor().equals(color)){
                find_obj.add(flower);
            }
        }
        return  find_obj;

    }
    public ArrayList flower_type_filter(ArrayList<Flower> item_array, FlowerType fl_type){
        ArrayList<Flower> find_obj = new ArrayList<Flower>();
        for (int i = 0; i < item_array.size(); i++){
            if (item_array.get(i).getFlowerType().equals(fl_type)){
                find_obj.add(item_array.get(i));
            }
        }
        return  find_obj;

    }
    public ArrayList flower_price_filter(ArrayList<Flower> item_array, double price){
        ArrayList<Flower> find_obj = new ArrayList<Flower>();
        for (int i = 0; i < item_array.size(); i++){
            if (item_array.get(i).getPrice() <= price){
                find_obj.add(item_array.get(i));
            }
        }
        return  find_obj;

    }

}
