// method overriding

class Father{
    void print(){
        System.out.println("From Father");
    }
}

class Son extends Father{
    void print(){
        System.out.println("From Son");
    }
}

public class MethodOverriding{
    public static void main(String[] args){
        Son s1 = new Son();
        s1.print();
    }
}
