package delivery;

public class Pay_pal_payment_strategy implements Payment{
    @Override
    public String pay(double price) {
        String msg = ("Payment will be made by pay pal. You should pay: " + price);
        return msg;
    }
}
