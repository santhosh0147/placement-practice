// 1. Write overloaded methods to find average of 2 or 3 numbers.

public class OverloadedAverage {
    double Avg(double a,double b,double c){
        return (a+b+c)/3;
    }
    int Avg(int a,int b, int c){
        return (a+b+c)/3;
    }

    public static void main(String[] args) {
        OverloadedAverage s1 = new OverloadedAverage();
        System.out.println(s1.Avg(5.5,5.6,5));
        System.out.println(s1.Avg(50.22,30,20));
    }
}
