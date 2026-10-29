// Hierarchical Inheritance

class Father{
    char gender = 'M';
    String name = "Sivan";
    void print(){
        System.out.println("this class is child class");
    } }
class Son1 extends Father{
    String name = "Murugan";
    void print(){
        System.out.println("this class is sub class");
    }
}
class Son2 extends Father{
    String name = "Santhosh";
    void print(){
        System.out.println("this class is sub class");
    }
}
public class HierarchicalInheritance{
    public static void main(String[] args) {
        Son1 s1 = new Son1();
        System.out.println(s1.name);
        System.out.println(s1.gender);
        s1.print();

    }
}
