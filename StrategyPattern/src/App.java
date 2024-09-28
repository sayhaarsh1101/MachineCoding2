public class App {
    public static void main(String[] args) throws Exception {
        Payment payment1 = new Payment(new CreditCardPayment());
        payment1.paymentMode(1000);
        
        Payment payment2 = new Payment(new UpiPayment());
        payment2.paymentMode(2000);
    }
}
