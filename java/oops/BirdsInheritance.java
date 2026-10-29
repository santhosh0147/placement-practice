class birds{
    String name = "peacoack";
    void print(){
        System.out.println("parent class");
    }
}
class cheeks extends birds{
    void bird(){
        print();
        System.out.println(name);
    }
}
public class BirdsInheritance{
    public static void main(String[] args) {
        cheeks c1 = new cheeks();
        c1.bird();
    }
}
