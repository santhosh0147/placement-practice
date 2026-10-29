// 3.Write a method to find whether a number is a two digit number.
// Return bool value - true or false.

public class TwoDigitCheck {
    static boolean  twoDigit(int n){
        return (n<100 && n>9);
    }

    public static void main(String[] args) {
        System.out.println(twoDigit(23));
        System.out.println(twoDigit(123));
    }
}
