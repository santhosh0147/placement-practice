abstract class Bank{
    abstract double getInterestrate();
}
class SBI extends Bank{
    double getInterestrate(){
        return 8.5;
    }
}
class HDFC extends Bank{
    double getInterestrate(){
        return 8.0;
    }
}
public class AbstractBank {
    public static void main(String[] args) {
        Bank b1 = new SBI();
        System.out.println(b1.getInterestrate());
        Bank b2 =new HDFC();
        System.out.println(b2.getInterestrate());
    }
}
