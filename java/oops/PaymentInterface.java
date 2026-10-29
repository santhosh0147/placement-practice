// interface

interface  payment{
    void pay();
}
class upi implements payment{
    public void pay(){
        System.out.println("paid using upi");
    }
}
public class PaymentInterface {
    public static void main(String[] args) {
        payment p1 = new upi();
        p1.pay();
    }
}
