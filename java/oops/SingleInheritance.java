// single inheritense

class father{
    char gender = 'm';
    void print(){
        System.out.println("parent class");
    }
}
class son extends father{

}
public class SingleInheritance{
    public static void main(String[] args) {
        son s1 = new son();
        System.out.println( s1.gender);
        s1.print();
    }
}
