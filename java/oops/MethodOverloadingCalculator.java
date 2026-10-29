// polymorphism

class calculator{
    int add(int a , int b ){
        return  a+b;
    }
    int add (int a, int b, int c){
        return  a+b+c;
    }
}
public class MethodOverloadingCalculator {
    public static void main(String[] args) {
        calculator c1 = new calculator();
        System.out.println(c1.add(15,15));
        System.out.println(c1.add(30,15,15));

    }
}
