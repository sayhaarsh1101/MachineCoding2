public class CreditCardPayment implements PaymentStrategy{

    @Override
    public void pay(int amount){
        System.out.println("Amount paid by credit card" + amount);
    }

}
