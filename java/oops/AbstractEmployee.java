abstract class employee {
    abstract double salary(double a);
}
class manager extends employee{
    double salary(double a){
        return a;
    }
}
class developer extends employee{
    double salary (double a){
        return a;
    }
}
public class AbstractEmployee {
    public static void main(String[] args) {
        employee n = new manager();
        System.out.println(n.salary(25000.33));
        employee m = new developer();
        System.out.println(m.salary(30000.55));
    }
}
