package delivery;

public class Credit_card_payment_strategy implements Payment{
    @Override
    public String pay(double price) {
        String msg = ("Payment will be made by credit card. You should pay: " + price);
        return msg;
    }
}
