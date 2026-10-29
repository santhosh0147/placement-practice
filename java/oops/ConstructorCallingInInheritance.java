// Constructor Calling in Inheritance

class Father {
    Father(){
        System.out.println("Father constructor");
    }
}
class Son extends Father{
    Son(){
        System.out.println("Son constructor");
    }
}
public class ConstructorCallingInInheritance{
    public static void main(String[] args) {
        Son s1 = new Son();
    }
}
