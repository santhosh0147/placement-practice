interface payment{
    abstract void pay(double a);
}
class upi implements payment{
    public void pay(double a){
        System.out.println("upi payment : "+ a);
    }
}
class card implements payment{
    public void pay(double a){
        System.out.println("card payment : " +a);
    }
}
public class PaymentUpiCard {
    public static void main(String[] args) {
        payment p1 = new upi();
        p1.pay(500);
        payment p2 = new card();
        p2.pay(2000);
    }
}
