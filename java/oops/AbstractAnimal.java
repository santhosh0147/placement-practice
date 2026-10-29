// absract

abstract class animal{
    abstract void sound();

}
class dog extends animal{
    void sound(){
        System.out.println("bark");
    }
}
class cat extends animal{
    void sound(){
        System.out.println("meow");
    }
}
public class AbstractAnimal {
    public static void main(String[] args) {
        animal a1 = new dog();
        animal a2 = new cat();
        a1.sound();
        a2.sound();
    }
}
