// Bank Interest Program

class Bank{
    void  interest() {
        System.out.println("general intterest");
    }
}
class HDFC extends Bank{
    void interest(){
        System.out.println("HDFC interest");
    }
}
class SBI extends Bank{
    void interest(){
        System.out.println("SBI interest");
    }
}
public class BankInterest {
    public static void main(String[] args) {
        SBI sbi = new SBI();
        sbi.interest();
    }
}
