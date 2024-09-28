public class Payment {
    private PaymentStrategy paymentStrategy;

    public Payment(){
        
    }

    public Payment(PaymentStrategy paymentStrategy){
        this.paymentStrategy = paymentStrategy;
    }

    public void paymentMode(int amount){
        paymentStrategy.pay(amount);
    }

}
