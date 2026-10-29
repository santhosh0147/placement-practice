abstract class shape{
    abstract double area(int a);
}
class square extends shape{
    double area( int a) {
        return a*a;
}}
class circle extends shape{
    double area(int r) {
        return 1/2*3.14 *r;
    }
}
public class AbstractShape {
    public static void main(String[] args) {
        shape s1 = new square();
        System.out.println(s1.area(5));
    }
}
