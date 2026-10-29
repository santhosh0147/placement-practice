// 1.Write a method to find sum of digits of a number and return its
// value. Call it multiple times for different values.

public class SumOfDigitsMethod {
    static int sumofnum(int n){
        int sum= 0;
        int m=n;
        while (true){
            if (m == 0) {
                break;
            }
            int o = m%10;
            sum+=o;
            m = m/10;

        }

        return sum;
    }
    public static void main(String[] args) {
        System.out.println(sumofnum(4));
        System.out.println(sumofnum(123));
        System.out.println(sumofnum(147));
    }
}
