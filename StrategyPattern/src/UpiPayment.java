public class UpiPayment implements PaymentStrategy{

    @Override
    public void pay(int amount){
        System.out.println("Amount paid by upi" + amount);
    }

}
