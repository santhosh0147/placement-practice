// Multilevel Inheritance

class father{
    char gender = 'M';
    void print(){
        System.out.println("from parent class");
    }
}
class son extends father{

}
class  grandson extends son{

}
public class MultilevelInheritance{
    public static void main(String[] args) {
        grandson gs = new grandson();
        System.out.println(gs.gender);
        gs.print();
        son s1 = new son();
        System.out.println(s1.gender);
        s1.print();
}}
