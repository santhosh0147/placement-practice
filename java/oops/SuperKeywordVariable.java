class Father{
    String name = "Murugan";
}

class Son extends Father{
    String name = "Santhosh";

    void show(){
        System.out.println(super.name);
        System.out.println(name);

    }
}
public class SuperKeywordVariable {
    public static void main(String[] args) {
        Son s1 = new Son();
        s1.show();
    }
}
