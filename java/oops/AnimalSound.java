class animal{
    void sound(){
        System.out.println("animal has sound");
    }
}
class dog extends animal{
    @Override
    void sound() {
        System.out.println("bark");
    }
}
class cat extends animal{
    void sound(){
        System.out.println("meow");
    }
}
public class AnimalSound {
    public static void main(String[] args) {
        animal one = new dog();
        one.sound();
    }
}
