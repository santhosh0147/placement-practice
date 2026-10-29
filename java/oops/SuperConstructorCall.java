// parent constructor calling

class Father{
    String name = "murugan";
    Father(){
        System.out.println("parent class | father");
    }
}
class Son extends Father{
    String name ="santhosh";
    void fack(){
        System.out.println(super.name);
        Father f1 = new Father();
        System.out.println(name);
        System.out.println("child class | son");
    }
    Son(){
        super();
    }

}
public class SuperConstructorCall{
    public static void main(String[] args) {
        Son s1 = new Son();
        s1.fack();
}}
