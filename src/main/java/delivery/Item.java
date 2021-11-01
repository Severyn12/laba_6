package delivery;

abstract public class Item {
    private String description_string = "";

    public String getDescription(){
        return description_string;
    }

    abstract public double getPrice();


}
